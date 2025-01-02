package com.yash.bookMyShow.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.yash.bookMyShow.dao.TicketDao;
import com.yash.bookMyShow.model.Ticket;

@Controller
public class TicketController {

	private final TicketDao ticketDao;

    public TicketController() {
        this.ticketDao = new TicketDao();
    }

    @ResponseBody
    @RequestMapping(value = "/listMovie")
    public ModelAndView listMovie(HttpServletResponse response) throws IOException, SQLException {
    	List<Ticket> tickets = ticketDao.getAllTickets();
    	
        System.out.println(tickets.toString());
        return new ModelAndView("ticket/listMovie");
    }
    
    @RequestMapping(value = "/bookingTicket", method = RequestMethod.POST)
    public ModelAndView processTicket(HttpServletRequest request) {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String event = request.getParameter("event");
        String theater = request.getParameter("theater");
        String time = request.getParameter("time");
        
        List<Ticket> tickets = ticketDao.getAllTickets();
        List<String> seatNumbers = new ArrayList<>();
        for (Ticket ticket : tickets) {
            seatNumbers.add(ticket.getSeatNumbers());
        }

        System.out.println("Seat Numbers: " + seatNumbers.toString());
        System.out.println("name " + name);
        
        ModelAndView modelAndView = new ModelAndView("ticket/bookingTicket");
        modelAndView.addObject("name", name);
        modelAndView.addObject("email", email);
        modelAndView.addObject("event", event);
        modelAndView.addObject("theater", theater);
        modelAndView.addObject("time", time);
        modelAndView.addObject("seatNumbers", seatNumbers);
        return modelAndView;
    }

    @RequestMapping(value = "/processTicket", method = RequestMethod.POST)
    public ModelAndView bookedTicket(HttpServletRequest request) throws IOException {
    	String name = request.getParameter("name");
        String email = request.getParameter("email");
        String event = request.getParameter("event");
        String theater = request.getParameter("theater");
        String time = request.getParameter("time");

        int seats;
        try {
            seats = Integer.parseInt(request.getParameter("seats"));
        } catch (NumberFormatException e) {
            return new ModelAndView("ticket/bookingTicket", "errorMessage", "Invalid number of seats entered.");
        }

        String seatsNumber = request.getParameter("seatsNumber");
        double pricePerSeat = 20.0;
        double totalAmount = seats * pricePerSeat;

        Ticket ticket = new Ticket();
        ticket.setCustomerId(1);
        ticket.setSeatCount(seats);
        ticket.setSeatNumbers(seatsNumber);
        ticket.setSeatAvailable(0);
        ticket.setTicketPrice(totalAmount);
        ticket.setTicketStatus(1);
        
        ticketDao.saveTicket(ticket);

        ModelAndView modelAndView = new ModelAndView("ticket/processTicket");
        modelAndView.addObject("name", name);
        modelAndView.addObject("email", email);
        modelAndView.addObject("event", event);
        modelAndView.addObject("theater", theater);
        modelAndView.addObject("time", time);
        modelAndView.addObject("seats", seats);
        modelAndView.addObject("seatsNumber", seatsNumber);
        modelAndView.addObject("totalAmount", totalAmount);
        return modelAndView;
    }
}
package com.yash.bookMyShow.controller;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
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

    @RequestMapping(value = "/listMovie")
    @ResponseBody
    public ModelAndView listMovie(HttpServletResponse response) throws IOException, SQLException {
    	List<Ticket> tickets = ticketDao.getAllTickets();
        System.out.println(tickets.toString());
        return new ModelAndView("ticket/listMovie");
    }

    @RequestMapping(value = "/bookingTicket", method = RequestMethod.GET)
    public ModelAndView bookingTicket(HttpServletRequest request, HttpServletResponse response) throws IOException {
        return new ModelAndView("ticket/bookingTicket");
    }

    @RequestMapping(value = "/bookingTicket", method = RequestMethod.POST)
    public ModelAndView processTicket(HttpServletRequest request) {
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

//        Ticket ticket = new Ticket(name, email, event, theater, time, seats, seatsNumber, totalAmount);
//        ticketDao.saveTicket(ticket);

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

//    @RequestMapping(value = "/bookedTicket")
//    public ModelAndView bookedTicket(HttpServletResponse response) throws IOException {
//        List<Ticket> tickets = ticketDao.getTickets();
//        ModelAndView modelAndView = new ModelAndView("ticket/bookedTicket");
//        modelAndView.addObject("tickets", tickets);
//        return modelAndView;
//    }
}
package com.yash.bookMyShow.dao;

import com.yash.bookMyShow.model.Ticket;
import com.yash.bookMyShow.util.TicketUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class TicketDao {

    private SessionFactory sessionFactory = TicketUtil.getSessionFactory();

    public List<Ticket> getAllTickets() {
        Transaction transaction = null;
        List<Ticket> tickets = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            Query<Ticket> query = session.createQuery("FROM Ticket", Ticket.class);
            tickets = query.list();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace(); // Handle exception appropriately
        }
        return tickets;
    }
}
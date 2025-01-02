package com.yash.bookMyShow.dao;

import com.yash.bookMyShow.model.Movies;
import com.yash.bookMyShow.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class MovieDao {

    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public List<Movies> getAllMovies() {
        Transaction transaction = null;
        List<Movies> tickets = null;
        Session session = null; // Declare session outside try block

        try {
            session = sessionFactory.openSession(); // Open session
            transaction = session.beginTransaction(); // Begin transaction
            Query<Movies> query = session.createQuery("FROM Movies", Movies.class);
            tickets = query.list(); // Fetch results
            transaction.commit(); // Commit transaction
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback(); // Rollback if there's an error
            }
            e.printStackTrace(); // Print stack trace for debugging
        } finally {
            if (session != null) {
                session.close(); // Close session in finally block
            }
        }
        return tickets; // Return the list of movies
    }
}
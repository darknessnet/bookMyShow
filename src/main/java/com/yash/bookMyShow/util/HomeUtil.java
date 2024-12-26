package com.yash.bookMyShow.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HomeUtil {

	static final String URL = "jdbc:mysql://localhost:3306/employees";
    static final String USER = "root";
    static final String PASSWORD = "root";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch
        (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private Connection con = null;

    public Connection openConnection() {
        try {
            if (con == null) {
                con = DriverManager.getConnection(URL, USER, PASSWORD);
            }
            if (con.isClosed()) {
                con = DriverManager.getConnection(URL, USER, PASSWORD);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return con;
    }

    public PreparedStatement
    createPreparedStatement(String sql) {
        try {
            return openConnection().prepareStatement(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex.getMessage());
        }
    }

    public void closePreparedStatement(PreparedStatement pstmt) {
        try {
            pstmt.close();
        } catch (SQLException ex) {
        }
    }

    public ResultSet createResultSet(String query) {
        try {

            return openConnection().createStatement().executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }

    public void closeResultSet(ResultSet rs) {
        try {
            rs.close();
        } catch (SQLException ex) {
        }
    }

    public void closeConnection() {
        try {
            con.close();
        } catch (SQLException ex) {
        }
    }
}

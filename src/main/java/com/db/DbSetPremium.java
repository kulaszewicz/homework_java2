package com.db;

import java.sql.*;

public class DbSetPremium {

    public static void setPremium (Connection con, String connectionString, String username) {

        System.out.println("Attempting to connect to db ...");


        try {
            Class.forName("org.hsqldb.jdbc.JDBCDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            try {
                con = DriverManager.getConnection(connectionString, "SA", "");

                if (con!= null) {
                    System.out.println("Connected!");
                } else {
                    System.out.println("Problem with creating connection");
                }
                Statement s = con.createStatement();
                s.executeUpdate("UPDATE PUBLIC.USERS SET isPremium = TRUE WHERE username = ('"+username+"')");


            } catch (SQLException e) {
                e.printStackTrace();
            }
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

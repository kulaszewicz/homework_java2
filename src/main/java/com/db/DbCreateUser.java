package com.db;
import java.sql.*;


public class DbCreateUser {

    public static void addUser (Connection con, String connectionString, String login, String password, String mail) throws Exception {

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

                Statement s=con.createStatement();
                s.executeUpdate("INSERT INTO PUBLIC.USERS(USERNAME,PASSWORD,MAIL) VALUES ('"+login+"','"+password+"','"+mail+"')");


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

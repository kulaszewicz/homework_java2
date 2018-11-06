package com.db;

import com.classes.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;



public class DbConnect {
   // private static Connection con;
   // private static String connectionString = "jdbc:hsqldb:/database/localdb";


    public static List<User> connect(Connection con, String connectionString) throws Exception {

    //public static void main(String[] args) {

        System.out.println("Attempting to connect to db ...");

        List<User> users = new ArrayList<>();

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
                //con.createStatement().executeUpdate(createUser);


                //con.createStatement().executeUpdate(insertUsers);

                PreparedStatement pst = con.prepareStatement("SELECT * FROM PUBLIC.USERS");
                pst.clearParameters();
                ResultSet rs = pst.executeQuery();


                while(rs.next()){
                    users.add(new User(
                                    rs.getInt(1),
                                    rs.getString(2),
                                    rs.getString(3),
                                    rs.getString(4),
                                    rs.getBoolean(5),
                                    rs.getBoolean(6)
                            )
                    );
                }


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

        return users;
    }

}

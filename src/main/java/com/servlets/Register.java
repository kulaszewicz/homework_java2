package com.servlets;
import com.db.DbCreateUser;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.Connection;



@WebServlet(name = "Register", urlPatterns = "/Register")
public class Register extends HttpServlet {

    static Connection con;
    static String connectionString = "jdbc:hsqldb:hsql://localhost/userDB";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        String username = request.getParameter("login");
        String password = request.getParameter("password");
        String email = request.getParameter("e-mail");

        try {
            DbCreateUser.addUser(con, connectionString, username, password, email);
            response.setContentType("text/html");
            response.getWriter().println("<h1>Register completed");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}

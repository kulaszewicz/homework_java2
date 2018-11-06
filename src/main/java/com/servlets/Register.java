package com.servlets;

import com.classes.User;
import com.db.DbConnect;

import java.io.IOException;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.Connection;
import java.util.List;


@WebServlet(name = "Register", urlPatterns = "/Register")
public class Register extends HttpServlet {

    static Connection con;
    static String connectionString = "jdbc:hsqldb:hsql://localhost/userDB";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        String username = request.getParameter("login");
        String password = request.getParameter("password");
        String secPassword = request.getParameter("confPassword");
        String email = request.getParameter("e-mail");

        response.setContentType("text/html");
        response.getWriter().println("<h1>Login: "+ username);
        response.getWriter().println("<h1>Password: "+ password);
        response.getWriter().println("<h1>PasswordAgain: "+ secPassword);
        response.getWriter().println("<h1>E-mail: "+ email);

        try {
            List<User> users = DbConnect.connect(con, connectionString);
            for(User u : users) {
                response.getWriter().println("<h2>ID: "+ u.id);
                response.getWriter().println("<h2>Login: "+ u.login);
                response.getWriter().println("<h2>Password: "+ u.password);
                response.getWriter().println("<h2>Mail: "+ u.mail);
                response.getWriter().println("<h2>IsPremium: "+ u.isPremium);
                response.getWriter().println("<h2>IsAdmin: "+ u.isAdmin);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
/*
class newUser {
    newUser(String username, String password, String email){
        this.username = username;
    }
}
*/
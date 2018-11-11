package com.servlets;

import com.db.DbSetPremium;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;

@WebServlet(name = "AdminAddPremium", urlPatterns = "/AdminAddPremium")
public class AdminAddPremium extends HttpServlet {

    static Connection con;
    static String connectionString = "jdbc:hsqldb:hsql://localhost/userDB";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("alogin");
        DbSetPremium.setPremium(con, connectionString, username);
        request.getRequestDispatcher("receiveAdmin.jsp").forward(request, response);
    }
}

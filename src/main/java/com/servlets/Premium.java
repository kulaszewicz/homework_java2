package com.servlets;

import com.classes.User;
import com.db.DbGetPremiumUsers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;

@WebServlet(name = "Premium", urlPatterns = "/Premium")
public class Premium extends HttpServlet {

    static Connection con;
    static String connectionString = "jdbc:hsqldb:hsql://localhost/userDB";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        try {
            List<User> premUsers = DbGetPremiumUsers.connect(con, connectionString);
            session.setAttribute("premUsers", premUsers);

        } catch (Exception e) {
            e.printStackTrace();
        }


        request.getRequestDispatcher("receivePremium.jsp").forward(request, response);
    }
}

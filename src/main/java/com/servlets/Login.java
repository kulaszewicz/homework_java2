package com.servlets;

import com.classes.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "Login", urlPatterns = "/Login")
public class Login extends HttpServlet {



    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        User curUser = (User) request.getAttribute("curUser");
        request.setAttribute("curUser", curUser);
        HttpSession session = request.getSession();

        session.setAttribute("curUser", curUser);
        request.getRequestDispatcher("receiveLogin.jsp").forward(request, response);
    }
}

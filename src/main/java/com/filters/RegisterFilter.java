package com.filters;

import com.classes.User;
import com.db.DbGetUsers;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;

@WebFilter(filterName = "RegisterFilter", urlPatterns = "/Register")
public class RegisterFilter implements Filter {

    static Connection con;
    static String connectionString = "jdbc:hsqldb:hsql://localhost/userDB";

    public void destroy() {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {

        String username = request.getParameter("login");
        String password = request.getParameter("password");
        String secPassword = request.getParameter("confPassword");
        String email = request.getParameter("e-mail");

        HttpServletResponse HttpResponse = (HttpServletResponse) response;

        boolean isUser = true;

        try {
            List<User> users = DbGetUsers.connect(con, connectionString);

            for(User u : users) {
                if (u.login.equals(username) || u.mail.equals(email)){
                    HttpResponse.sendRedirect("index.jsp");
                    isUser = false;
                } else if (!password.equals(secPassword)){
                    HttpResponse.sendRedirect("index.jsp");
                    isUser = false;
                }
            }

            if (isUser){
                chain.doFilter(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void init(FilterConfig config) throws ServletException {

    }

}

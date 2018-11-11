package com.filters;

import com.classes.User;
import com.db.DbGetUsers;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;

@WebFilter(filterName = "PremiumFilter", urlPatterns = "/Premium")
public class PremiumFilter implements Filter {

    static Connection con;
    static String connectionString = "jdbc:hsqldb:hsql://localhost/userDB";

    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletResponse response = (HttpServletResponse) resp;
        HttpServletRequest request = (HttpServletRequest) req;

        HttpSession session = request.getSession();

        User curUser = (User) session.getAttribute("curUser");

        if (curUser.isPremium){
            chain.doFilter(req, resp);
        } else {
            response.setHeader("Refresh","300");
            response.getWriter().println("<h1>Error 500: No permission!");
        }

    }

    public void init(FilterConfig config) throws ServletException {

    }

}

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

@WebFilter(filterName = "LoginFilter", urlPatterns = "/Login")
public class LoginFilter implements Filter {

    static Connection con;
    static String connectionString = "jdbc:hsqldb:hsql://localhost/userDB";

    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        HttpServletResponse response = (HttpServletResponse) resp;
        HttpServletRequest request = (HttpServletRequest) req;

        String username = req.getParameter("llogin");
        String password = req.getParameter("lpassword");


        boolean isUser = false;

        Object curUser = new User(1, "sample", "sample", "sample", false, false);

        try {
            List<User> users = DbGetUsers.connect(con, connectionString);
            for(User u : users) {
                if (username.equals(u.login) && password.equals(u.password)){
                    isUser = true;
                    curUser = u;
                } else continue;
            }

            if (isUser){
                req.setAttribute("curUser", curUser);
                chain.doFilter(req, resp);
            }else {
                resp.getWriter().println("<h1>Failed to login!");
                response.sendRedirect("index.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public void init(FilterConfig config) throws ServletException {

    }

}

package iuh.fit.se.bai1;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(name = "indexServlet", urlPatterns = {"/bai4", "/Ex4"})
//@WebServlet(name = "indexServlet",
//        value = "/bai4",
//        initParams = {
//                @WebInitParam(name = "username", value= "nguyenvanpho"),
//                @WebInitParam(name = "email", value = "nguyenvanpho@gmail.com"),
//                @WebInitParam(name = "password", value = "123123")
//        }
//
//)

public class Bai4Servlet extends HttpServlet {
    private String password;
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        password = config.getInitParameter("password");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        // Hello
        PrintWriter writer = resp.getWriter();
        writer.println("<html><body>");
        writer.println("<h4> Username: " + this.getServletConfig().getInitParameter("username")  + "</h4>");
        writer.println("<h4> Email: " + this.getServletConfig().getInitParameter("email")  + "</h4>");
        writer.println("<h4> Password: " + password  + "</h4>");
        writer.println("<h4> School: " + this.getServletContext().getInitParameter("School")  + "</h4>");


        writer.println("</body></html>");

        writer.flush();
        writer.close();
    }
}

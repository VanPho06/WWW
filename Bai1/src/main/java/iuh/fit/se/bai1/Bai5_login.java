package iuh.fit.se.bai1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "loginServlet", value="/login")
public class Bai5_login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");


        PrintWriter writer = resp.getWriter();
        writer.println("<html><body>");
        writer.println("<h1>Login information </h1>");
        writer.println("<h6> Full name: "+req.getParameter("first-name")+req.getParameter("last-name")+ "</h6>");
        writer.println("<h6> Username: "+req.getParameter("username")+ "</h6>");
        writer.println("<h6> Email: "+req.getParameter("email")+ "</h6>");
        writer.println("<h6> Facebook"+req.getParameter("facebook")+ "</h6>");
        writer.println("<h6> Short Bio: "+req.getParameter("bio")+ "</h6>");

        writer.println("</body></html>");

        writer.flush();
        writer.close();
    }


}

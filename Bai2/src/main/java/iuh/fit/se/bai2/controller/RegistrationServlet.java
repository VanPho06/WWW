package iuh.fit.se.bai2.controller;

import iuh.fit.se.bai2.model.User;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet ("/registration-form")
public class RegistrationServlet extends HttpServlet {
    public RegistrationServlet() {
        super();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("fn");
        String lastName = req.getParameter("ln");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String birthday = req.getParameter("dob");
        String gender = req.getParameter("gender");

        User user = new User(firstName, lastName, email, password, birthday, gender);

        req.setAttribute("user", user);

        RequestDispatcher rq =  req.getRequestDispatcher("Result.jsp");
        rq.forward(req, resp);

    }
}

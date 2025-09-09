package iuh.fit.se.bai1;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/registration-form")
public class Registration extends HttpServlet {
    public Registration() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().append("Server at: ").append(req.getContextPath());
        //Get data from Form
        String fname = req.getParameter("fn");
        String lname = req.getParameter("ln");
        String bod =(String) req.getParameter("dob");
        String email = req.getParameter("email");
        String mn = req.getParameter("mn");
        String gender = req.getParameter("gender");
        String address = req.getParameter("address");
        String city = req.getParameter("city");
        String state = req.getParameter("state");
        String country = req.getParameter("country");
        String hobbies = req.getParameter("hobbies");
        String course = req.getParameter("course");

        Student student = new Student();
        student.setFirstName(fname);
        student.setLastName(lname);
        student.setEmail(email);
        student.setGender(gender);
        student.setBirthday(bod);

        req.setAttribute("student", student);
        RequestDispatcher rd = req.getRequestDispatcher("result-form.jsp");
        rd.forward(req, resp);
    }
}
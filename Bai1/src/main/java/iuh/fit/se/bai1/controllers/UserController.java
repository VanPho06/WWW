package iuh.fit.se.bai1.controllers;

import iuh.fit.se.bai1.daos.UserDAO;
import iuh.fit.se.bai1.daos.impl.UserDaoImpl;
import iuh.fit.se.bai1.entities.User;
import jakarta.annotation.Resource;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.sql.DataSource;
import java.io.IOException;

@WebServlet(name = "UserController", urlPatterns = {"/user","/user*"})
public class UserController extends HttpServlet {

    @Resource(name = "jdbc/user")
    private DataSource dataSource;

    private UserDAO userDAO;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        this.userDAO = new UserDaoImpl(this.dataSource);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "tao-user": handleAddUser(req, resp); break;
            default:req.getRequestDispatcher("/success.jsp").forward(req, resp);


        }
    }

    private void handleAddUser(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        try{


//        UserDAO userDAO = new UserDaoImpl(this.dataSource);
        String firstName = req.getParameter("fn");
        String lastName = req.getParameter("ln");
        String email = req.getParameter("email");
        String  password = req.getParameter("pw");
        String dob = req.getParameter("dob");
        String gender = req.getParameter("gender");
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setPassword(password);
        user.setGender(gender);
        user.setBirthday(dob);
        userDAO.register(user);
        req.setAttribute("newUser", user);
        req.setAttribute("message", "Successfully added user");
        req.getRequestDispatcher("/success.jsp").forward(req, resp);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

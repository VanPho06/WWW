package iuh.fit.se.bai1.daos.impl;

import iuh.fit.se.bai1.daos.UserDAO;
import iuh.fit.se.bai1.entities.User;
//import org.mariadb.jdbc.Connection;
import java.sql.Connection;
import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDAO {
    private final DataSource dataSource;

    public UserDaoImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void register(User user) {
        String sql = "INSERT INTO user (firstName, lastName, email,password, birthday, sex)  " +
                "values (?, ?, ?, ?, ?, ?)";
        try(
                Connection con = (Connection) this.dataSource.getConnection();
                PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
            )
        {
            ps.setString(1,user.getFirstName());
            ps.setString(2,user.getLastName());
            ps.setString(3,user.getEmail());
            ps.setString(4,user.getPassword());
            ps.setString(5,user.getBirthday());
            ps.setString(6,user.getGender());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

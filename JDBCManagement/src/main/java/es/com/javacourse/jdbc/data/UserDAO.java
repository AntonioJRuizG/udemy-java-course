package es.com.javacourse.jdbc.data;

import es.com.javacourse.jdbc.domain.Person;
import es.com.javacourse.jdbc.domain.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static es.com.javacourse.jdbc.data.ConnectionServer.close;
import static es.com.javacourse.jdbc.data.ConnectionServer.getConnection;

public class UserDAO {
    private static final String SQL_SELECT = "SELECT user_id, username, password FROM user";
    private static final String SQL_INSERT = "INSERT INTO user(username,password) VALUES (?, ?)";
    private static final String SQL_UPDATE = "UPDATE user SET username = ?, password = ? WHERE user_id = ?";
    private static final String SQL_DELETE = "DELETE FROM user WHERE user_id= ?";

    public List<User> select(){
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        User user;
        List<User> users = new ArrayList<>();

        try {
            conn = getConnection();
            stm = conn.prepareStatement(SQL_SELECT);
            rs = stm.executeQuery();

            while(rs.next()){
                int idUser = rs.getInt("user_id");
                String username = rs.getString("username");
                String password = rs.getString("password");

                user = new User(idUser, username, password);

                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                close(rs);
                close(stm);
                close(conn);
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }

        }

        return users;
    }

    public int insert(User user){
        int addedRegister = 0;
        Connection conn = null;
        PreparedStatement stm = null;

        try {
            conn = getConnection();
            stm = conn.prepareStatement(SQL_INSERT);
            stm.setString(1, user.getUsername());
            stm.setString(2, user.getPassword());
            addedRegister = stm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                conn.close();
                stm.close();
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }


        return addedRegister;
    }

    public int update (User user){
        Connection conn = null;
        PreparedStatement stm = null;
        int updatedRegisters = 0;

        try {
            conn = getConnection();
            stm = conn.prepareStatement(SQL_UPDATE);
            stm.setString(1, user.getUsername());
            stm.setString(2,  user.getPassword());
            stm.setInt(3, user.getUserId());
            updatedRegisters = stm.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                close(stm);
                close(conn);
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }

        return updatedRegisters;
    }

    public int delete(User user){
        Connection conn = null;
        PreparedStatement stm = null;
        int deletedRegisters = 0;
        try {
            conn = getConnection();
            stm = conn.prepareStatement(SQL_DELETE);
            stm.setInt(1, user.getUserId());
            deletedRegisters = stm.executeUpdate(); // return the number of modified registers
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }

        return deletedRegisters;
    }

}

package es.com.javacourse.jdbc;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        var url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&Timezone=UTC&allowPublicKeyRetrieval=true";
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, "root", "admin");
            Statement instruction = connection.createStatement();
            var sql = "SELECT id_person, name, surname, email, phone FROM person";
            ResultSet result = instruction.executeQuery(sql);
            while(result.next()){
                System.out.println("Id Peron: " + result.getInt("id_person") + ", name: " + result.getString("name"));
            }
            result.close();
            instruction.close();
            connection.close();
        }
        catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }
}
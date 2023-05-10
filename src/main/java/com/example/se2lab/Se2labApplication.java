package com.example.se2lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

class User {
    User(int id, String name, String password, String role) {
        this.id = id;
        this.name = name;
        this.password= password;
        this.role = role;
    }

    static User fromDatabase(ResultSet data) throws SQLException {
        final int id = data.getInt("id");
        final String name = data.getString("name");
        final String password = data.getString("passwort");
        final String role = data.getString("rolle");
        return new User(id, name, password, role);
    }

    final int id;
    final String name;
    final String password;
    final String role;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}

@SpringBootApplication
public class Se2labApplication {

    public static void main(String[] args) throws SQLException {
        SpringApplication.run(Se2labApplication.class, args);

        final Connection connection = connectDatabase();
        for (final User user : getAllUsers(connection)) {
            System.out.println(user);
        }
    }

    private static Connection connectDatabase() {
        try {
            final String url = "jdbc:mysql://localhost:3306/inventory-db";
            final String username = "admin";
            final String password = "admin";
            final String unicode="useSSL=false&autoReconnect=true&useUnicode=yes&characterEncoding=UTF-8";
            return DriverManager.getConnection(url + "?" + unicode, username, password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Cannot connect the database");
            throw new RuntimeException(e);
        }
    }

    private static List<User> getAllUsers(Connection connection) {
        final List<User> users = new ArrayList<>();
        final String query = "SELECT * FROM benutzer;";
        try {
            final Statement statement = connection.createStatement();
            final ResultSet result = statement.executeQuery(query);
            while (result.next()) {
                final User user = User.fromDatabase(result);
                users.add(user);
            }
            return users;
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot query the database", e);
        }
    }

}

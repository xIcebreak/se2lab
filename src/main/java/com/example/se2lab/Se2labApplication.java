package com.example.se2lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class Se2labApplication {

    public static void main(String[] args) {
        SpringApplication.run(Se2labApplication.class, args);
        connectDatabase();
    }

    private static void connectDatabase() {
        final String url = "jdbc:mysql://localhost:3306/demoinventorydb";
        final String username = "root";
        final String password = "mysqldbpw123$";
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Database connected");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }
    }

}

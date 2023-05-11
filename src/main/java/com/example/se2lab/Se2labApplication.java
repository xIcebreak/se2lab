package com.example.se2lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@EnableJpaRepositories(basePackages = "com.example")
@SpringBootApplication(scanBasePackages = {"com.example.se2lab"})
@EntityScan("com.example.se2lab")
public class Se2labApplication {

    public static void main(String[] args) {
        SpringApplication.run(Se2labApplication.class, args);
        connectDatabase();
    }

    private static void connectDatabase() {
        final String url = "jdbc:mysql://localhost:3306/demoinventorydb";
        final String username = "root";
        final String password = "mysqldbpw123$";
        final String unicode="useSSL=false&autoReconnect=true&useUnicode=yes&characterEncoding=UTF-8";
        try {
            Connection connection = DriverManager.getConnection(url + "?" + unicode, username, password);
            System.out.println("Connected to Database");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}

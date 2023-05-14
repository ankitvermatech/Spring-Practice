package com.ankitverma.springpractice.firstspringcoreproject;

import org.springframework.beans.factory.annotation.Value;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.pwd}")
    private String password;

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.driver}")
    private String driver;

    public void display(){
        System.out.println("username "+ username + " , password "+password +" , url "+ url +" , driver " + driver);
    }

    public void getJdbcConnection() throws SQLException, ClassNotFoundException {
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url,username,password);
        System.out.println("Connection Successful "+ con);

    }
}

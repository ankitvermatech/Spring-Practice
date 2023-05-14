package com.ankitverma.springpractice.firstspringcoreproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class ConncectionCheck {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ApplicationContext context = new ClassPathXmlApplicationContext("firstspringcoreproject/beans.xml");
       JDBCConnection con =  context.getBean("sqlConnection",JDBCConnection.class);
       con.display();
       con.getJdbcConnection();
    }
}

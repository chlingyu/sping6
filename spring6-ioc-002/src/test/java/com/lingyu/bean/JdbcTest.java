package com.lingyu.bean;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class JdbcTest {

    @Test
    public void testDataSource() throws SQLException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans-jdbc.xml");
        DataSource dataSource = ac.getBean(DataSource.class);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }


    @Test
    public void testBeanScope(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans-jdbc.xml");
        User user1 = ac.getBean(User.class);
        User user2 = ac.getBean(User.class);
        System.out.println(user1==user2);
    }
}

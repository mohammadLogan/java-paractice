package com.example.demo;

import com.example.demo.creational.singleton.MySingletonOBJ;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


class MySingletonOBJTest {

    @Test
    void getInstance() {
        MySingletonOBJ mySingletonOBJ = MySingletonOBJ.getInstance();
        Connection connection = mySingletonOBJ.getConnection();
        String createQuery = "CREATE TABLE PERSON(id int primary key,name varchar(255))";
        try (Statement statement = connection.createStatement()) {
            statement.execute(createQuery);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String insertQuery = "INSERT into person (id,name) values(?,?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, "mamad");
            preparedStatement.executeUpdate();
            preparedStatement.setInt(1, 2);
            preparedStatement.setString(2, "ali");
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

        String selectQuery = "select count(*) from person";
        try (Statement statement = connection.createStatement()) {
            try (ResultSet resultSet = statement.executeQuery(selectQuery)) {
                if (resultSet.next()) {
                    System.out.println("this count is : " + resultSet.getInt(1));
                    Assertions.assertEquals(resultSet.getInt(1), 2);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void performanceTest() {
        long time = System.currentTimeMillis();
        System.out.println(MySingletonOBJ.getInstance());
        System.out.println(System.currentTimeMillis() - time);

        time = System.currentTimeMillis();
        System.out.println(MySingletonOBJ.getInstance());
        System.out.println(System.currentTimeMillis() - time);

        Assertions.assertEquals(System.currentTimeMillis() - time, 0);
    }
}
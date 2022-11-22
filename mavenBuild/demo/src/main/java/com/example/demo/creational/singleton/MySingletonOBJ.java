package com.example.demo.creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySingletonOBJ {

    private static MySingletonOBJ mySingletonOBJ = null;
    private Connection connection;

    private static final String DB_DRIVER = "org.h2.Driver";
    private static final String DB_CONNECTION = "jdbc:h2:mem:test;";
    private static final String DB_USERNAME = "";
    private static final String DB_PASS = "";


    private MySingletonOBJ() {
        initialConnection();
    }

    private void initialConnection() {
        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection(DB_CONNECTION, DB_USERNAME, DB_PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static MySingletonOBJ getInstance() {
        if (mySingletonOBJ == null) {
            synchronized (MySingletonOBJ.class) {
                if (mySingletonOBJ == null) {
                    mySingletonOBJ = new MySingletonOBJ();
                }
            }
        }
        return mySingletonOBJ;
    }
}

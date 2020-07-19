package ru.geekbrains.java.chat.server.core;

import java.sql.*;

public abstract class SqlClient {

    private static Connection connection;
    private static Statement statement;

    synchronized static void connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:chatDB.db");
            statement = connection.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    synchronized static void disconnect() {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    synchronized static String getNick(String login, String password) {
        String request = "SELECT nickname FROM users WHERE login='" +
                login + "' AND password='" + password + "'";
        try (ResultSet set = statement.executeQuery(request)) {
            if (set.next()) {
                return set.getString(1);
            } else {
                return null;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    synchronized static String create(String login, String password, String nickname){
        String request = "INSERT INTO users (login,password,nickname) VALUES (login'" + login + "'  password'" + password + " nickname'" + nickname + "'";
        try {
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  request;
}
}

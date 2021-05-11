package ro.unibuc.lab12.database.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfiguration {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/pao_lab12";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    private static Connection databaseConnection;

    private DatabaseConfiguration() {

    }

    public static Connection getDatabaseConnection() {
        try {
            if (databaseConnection == null || databaseConnection.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                databaseConnection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            }

        } catch (SQLException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }
        return databaseConnection;
    }
}

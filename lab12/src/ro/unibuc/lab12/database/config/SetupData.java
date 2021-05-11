package ro.unibuc.lab12.database.config;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SetupData {

    public void setup(){
        createTable();
        createFunction();
    }
    private void createTable() {
        String query = "CREATE TABLE IF NOT EXISTS books (\n" +
                "    id INT PRIMARY KEY AUTO_INCREMENT,\n" +
                "    title VARCHAR(255),\n" +
                "    code INT,\n" +
                "    is_borrowed BIT\n" +
                ")";

        try (Connection connection = DatabaseConfiguration.getDatabaseConnection()) {
            Statement statement = connection.createStatement();
            statement.execute(query);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //TODO: drop function if exists
    private void createFunction() {
        String query = "CREATE FUNCTION pao_lab12.borrow(required_id int) RETURNS int(11)\n" +
                "BEGIN\n" +
                "update pao_lab12.books\n" +
                "set is_borrowed = 1\n" +
                "where id = required_id;\n" +
                "RETURN row_count();\n" +
                "END";

        try (Connection connection = DatabaseConfiguration.getDatabaseConnection()) {
            Statement statement = connection.createStatement();
            statement.execute(query);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

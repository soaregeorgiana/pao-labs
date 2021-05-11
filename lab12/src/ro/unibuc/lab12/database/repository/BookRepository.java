package ro.unibuc.lab12.database.repository;

import ro.unibuc.lab12.database.config.DatabaseConfiguration;
import ro.unibuc.lab12.database.domain.Book;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    //PreparedStatement
    public Book save(Book book) {

        try (Connection connection = DatabaseConfiguration.getDatabaseConnection()) {
            String query = "INSERT into books(title, code, is_borrowed) VALUES(?,?,?)";

            PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, book.getTitle());
            preparedStatement.setInt(2, book.getCode());
            preparedStatement.setBoolean(3, book.isBorrowed());

            preparedStatement.execute();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            if (resultSet.next()) {
                book.setId(resultSet.getInt(1));
            }
            resultSet.close();
            return book;

        } catch (SQLException exception) {
            throw new RuntimeException("Something went wrong while saving the book: " + book);
        }
    }
    //TODO: findById - tema!!

    public List<Book> findAll() {
        List<Book> books = new ArrayList<>();
        try (Connection connection = DatabaseConfiguration.getDatabaseConnection()) {
            String query = "SELECT * FROM books";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                books.add(mapToBook(resultSet));
            }

            resultSet.close();
            return books;

        } catch (SQLException exception) {
            throw new RuntimeException("Something went wrong while tying to get all books: ");
        }
    }

    //CallableStatement
    public boolean update(int id) {
        try (Connection connection = DatabaseConfiguration.getDatabaseConnection()) {
            String query = "{?= call borrow(?)}";

            CallableStatement callableStatement = connection.prepareCall(query);
            callableStatement.setInt(2, id);
            callableStatement.registerOutParameter(1, Types.INTEGER);

            callableStatement.executeUpdate();
            int response = callableStatement.getByte(1);

            return response == 1;

        } catch (SQLException exception) {
            throw new RuntimeException("Something went wrong while tying to updated the book with id: " + id);
        }
    }

    private Book mapToBook(ResultSet resultSet) throws SQLException {
        Book book = new Book(resultSet.getString(2), resultSet.getInt(3), resultSet.getBoolean(4));
        book.setId(resultSet.getInt(1));
        return book;
    }
}

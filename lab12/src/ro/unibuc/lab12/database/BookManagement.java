package ro.unibuc.lab12.database;

import ro.unibuc.lab12.database.config.SetupData;
import ro.unibuc.lab12.database.domain.Book;
import ro.unibuc.lab12.database.service.BookService;

public class BookManagement {

    public static void main(String[] args) {

        SetupData setupData = new SetupData();
        setupData.setup();
        BookService bookService = new BookService();

        bookService.add(new Book("Mara", 345, true));
        bookService.add(new Book("Ion", 567, false));
        bookService.add(new Book("Baltagul", 878, false));

        System.out.println(bookService.getAll());

        System.out.println(bookService.borrow(5));
    }
}

package ro.unibuc.lab12.database.service;

import ro.unibuc.lab12.database.domain.Book;
import ro.unibuc.lab12.database.repository.BookRepository;

import java.util.List;

public class BookService {

    private BookRepository repository = new BookRepository();

    public Book add(Book book) {
        if (book.getTitle() != null) {
            return repository.save(book);
        } else {
            throw new RuntimeException("Bad request!");
        }
    }

    public List<Book> getAll() {
        return repository.findAll();
    }

    public boolean borrow(int id){
        //TODO: tema: found = findById; found.isBorrowed = false
        return repository.update(id);
    }
}

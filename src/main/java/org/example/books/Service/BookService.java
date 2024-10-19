package org.example.books.Service;

//import com.example.bookapi.entity.Book;
//import com.example.bookapi.repository.BookRepositoryInt;
import org.example.books.Entity.Book;
import org.example.books.Repository.BookRepositoryInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private final BookRepositoryInt bookRepository;

    @Autowired
    public BookService(BookRepositoryInt bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public Optional<Book> findBookById(Long id) {
        return bookRepository.findById(id);
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

    public Book updateBook(Long id, Book book) {
        if (!bookRepository.existsById(id)) {
            throw new IllegalArgumentException("Book with ID " + id + " does not exist");
        }
        book.setId(id);
        return bookRepository.save(book);
    }
}

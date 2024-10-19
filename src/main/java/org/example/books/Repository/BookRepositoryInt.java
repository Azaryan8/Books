package org.example.books.Repository;

//mport com.example.bookapi.entity.Book;
import org.example.books.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepositoryInt extends JpaRepository<Book, Long> {
    // Можно добавить дополнительные методы поиска, если нужно
}


package pl.rybak.dawid.bookstorespringexploratory.book.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.rybak.dawid.bookstorespringexploratory.book.Book;

interface BookJpaRepository extends JpaRepository<Book, Long> {
}


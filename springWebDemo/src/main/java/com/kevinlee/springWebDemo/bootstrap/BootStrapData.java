package com.kevinlee.springWebDemo.bootstrap;

import com.kevinlee.springWebDemo.domain.Author;
import com.kevinlee.springWebDemo.domain.Book;
import com.kevinlee.springWebDemo.repositories.AuthorRepository;
import com.kevinlee.springWebDemo.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Start to add some authors and books into the DB....");

        Author kevin = new Author("Kevin", "Lee");
        Book book = new Book("The Power of Speaking", "16816857568");
        kevin.getBooks().add(book);
        book.getAuthors().add(kevin);
        authorRepository.save(kevin);
        bookRepository.save(book);

        Author luice = new Author("Luice", "Rod");
        Book noEJB = new Book("J2EE Development without EJB", "12345657345");
        luice.getBooks().add(noEJB);
        noEJB.getAuthors().add(luice);
        authorRepository.save(luice);
        bookRepository.save(noEJB);

        System.out.println("Added " + bookRepository.count() + " books and "
                + authorRepository.count() + " authors into the DB...");
    }
}

package com.kevinlee.springWebDemo.repositories;

import com.kevinlee.springWebDemo.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {}

package com.kevinlee.springWebDemo.repositories;

import com.kevinlee.springWebDemo.domain.Author;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}

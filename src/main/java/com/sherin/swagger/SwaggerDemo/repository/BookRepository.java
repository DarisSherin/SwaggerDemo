package com.sherin.swagger.SwaggerDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sherin.swagger.SwaggerDemo.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}

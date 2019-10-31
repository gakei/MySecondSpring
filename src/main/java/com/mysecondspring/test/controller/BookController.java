package com.mysecondspring.test.controller;

import com.mysecondspring.test.model.Book;
import com.mysecondspring.test.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;
    @RequestMapping("/books")
    public List<Book> books(){
        List<Book> books = bookService.getAllBooks();
        return books;
    }
}

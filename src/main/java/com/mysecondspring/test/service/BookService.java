package com.mysecondspring.test.service;

import com.mysecondspring.test.mapper.BookMapper;
import com.mysecondspring.test.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookMapper bookMapper;
    public List<Book> getAllBooks() {
        return bookMapper.getAllBooks();
    }
}

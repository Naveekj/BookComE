package com.booknet.bookcomm.api.controller.book;

import com.booknet.bookcomm.model.Book;
import com.booknet.bookcomm.model.dao.BookDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookDAO repo;

    @GetMapping
    public List<Book> getAllBooks(){
        return repo.findAll();
    }
}

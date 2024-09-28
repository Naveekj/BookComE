//package com.booknet.bookcomm.api.controller.book;
//
//import com.booknet.bookcomm.model.dao.Book;
//import com.booknet.bookcomm.service.BookService;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/books")
//public class BookController {
//
//    private BookService bookService;
//
//    public BookController(BookService bookService) {
//        this.bookService = bookService;
//    }
//
//    @GetMapping
//    public List<Book> getBooks(){
//        return bookService.getBook();
//    }
//}

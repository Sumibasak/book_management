package com.qbent.book_manage.controller;

import com.qbent.book_manage.dto.Book;
import com.qbent.book_manage.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bookService")
public class BookController {
    @Autowired
    private IBookService iBookService;

    @PostMapping(value = "/create")
    public ResponseEntity<?> createLead(@RequestBody Book book){
        return iBookService.createLead(book);
    }
//
//    @PostMapping(value = "/Update")
//    public ResponseEntity<?> Update(@RequestBody Book book){
//        return iBookService.createLead(book);
//    }
//
//    @PostMapping(value = "/delete")
//    public ResponseEntity<?> delete(@RequestBody Book book){
//        return iBookService.createLead(book);
//    }
//
//    @PostMapping(value = "/fetch")
//    public ResponseEntity<?> fetch(@RequestBody Book book){
//        return iBookService.createLead(book);
//    }
}

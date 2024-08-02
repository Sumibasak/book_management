package com.qbent.book_manage.service;

import com.qbent.book_manage.dto.Book;
import org.springframework.http.ResponseEntity;

public interface IBookService {
    ResponseEntity<?> createLead(Book book);
}


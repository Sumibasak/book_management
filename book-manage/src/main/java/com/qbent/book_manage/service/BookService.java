package com.qbent.book_manage.service;

import com.qbent.book_manage.dto.Book;
import com.qbent.book_manage.entity.TblBook;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class BookService implements IBookService {

    @Override
    public ResponseEntity<?> createLead(Book book) {
        TblBook tblBook = TblBook.builder()
                .name(book.getName())
                .price(book.getPrice())
                .build();
        return new ResponseEntity<>(tblBook, HttpStatus.NOT_FOUND);
    }
}

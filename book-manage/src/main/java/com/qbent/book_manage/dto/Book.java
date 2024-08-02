package com.qbent.book_manage.dto;

import lombok.*;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private String name;
    private BigDecimal price;
}



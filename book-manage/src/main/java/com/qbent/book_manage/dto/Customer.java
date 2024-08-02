package com.qbent.book_manage.dto;

import jakarta.persistence.Entity;
import lombok.*;

import java.math.BigInteger;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    private String firstName;
    private String lastName;
    private String city;
}

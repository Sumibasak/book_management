package com.qbent.book_manage.service;

import com.qbent.book_manage.dto.Customer;
import org.springframework.http.ResponseEntity;

import java.math.BigInteger;

public interface ICustomerService {

    ResponseEntity<?> createLead(Customer customer);
    ResponseEntity<?> deleteLead(BigInteger id);
}


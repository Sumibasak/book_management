package com.qbent.book_manage.controller;

import com.qbent.book_manage.dto.Customer;
import com.qbent.book_manage.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.math.BigInteger;

@RestController
@RequestMapping("/customerService")
public class CustomerController {
    @Autowired
    private ICustomerService iCustomerService;

    @PostMapping(value = "/create")
    public ResponseEntity<?> createLead(@RequestBody Customer customer) {
        return iCustomerService.createLead(customer);
    }

    @PostMapping(value = "/update")
    public ResponseEntity<?> update(@RequestBody Customer customer) {
        return iCustomerService.createLead(customer);
    }

    @GetMapping(value = "/delete")
    public ResponseEntity<?> delete(@PathVariable("id") BigInteger id) {
        return iCustomerService.deleteLead(id);
    }





}

package com.qbent.book_manage.service;

import com.qbent.book_manage.dao.CustomerRepository;
import com.qbent.book_manage.dto.Customer;
import com.qbent.book_manage.entity.TblCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService{

    @Autowired
    private CustomerRepository customerRepo;

    @Override
    public ResponseEntity<?> createLead(Customer customer) {
       TblCustomer tblCustomer= TblCustomer.builder()
               .firstName(customer.getFirstName())
               .lastName(customer.getLastName())
               .city(customer.getCity())
               .build();
        customerRepo.save(tblCustomer);
        return new ResponseEntity<>(tblCustomer, HttpStatus.OK);

    }
}

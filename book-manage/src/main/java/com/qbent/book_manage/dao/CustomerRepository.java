package com.qbent.book_manage.dao;

import com.qbent.book_manage.entity.TblCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface CustomerRepository extends JpaRepository<TblCustomer, BigInteger> {
}

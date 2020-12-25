package com.southwind.repository;

import com.southwind.entity.Customer;

import java.util.List;

public interface CustomerDao {
    List<Customer> findByID(Integer id);
}

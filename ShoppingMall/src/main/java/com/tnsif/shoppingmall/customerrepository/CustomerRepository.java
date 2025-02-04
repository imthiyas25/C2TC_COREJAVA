package com.tnsif.shoppingmall.customerrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.shoppingmall.customermodel.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

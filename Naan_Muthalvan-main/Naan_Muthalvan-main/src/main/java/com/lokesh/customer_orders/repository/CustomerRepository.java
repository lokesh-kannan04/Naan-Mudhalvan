package com.lokesh.customer_orders.repository;

import com.lokesh.customer_orders.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Lokesh
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}

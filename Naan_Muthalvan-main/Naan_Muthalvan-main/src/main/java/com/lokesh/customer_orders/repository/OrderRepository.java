package com.lokesh.customer_orders.repository;

import com.lokesh.customer_orders.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Lokesh
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}

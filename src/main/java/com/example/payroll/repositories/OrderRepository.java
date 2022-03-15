package com.example.payroll.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.payroll.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

package com.pedrosantos.course.repositories;

import com.pedrosantos.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

package com.pedrosantos.course.repositories;

import com.pedrosantos.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

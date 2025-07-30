package com.pedrosantos.course.repositories;

import com.pedrosantos.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

package com.assignment1.ecommerce.repository;

import com.assignment1.ecommerce.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    // Spring Data JPA automatically provides CRUD methods
}
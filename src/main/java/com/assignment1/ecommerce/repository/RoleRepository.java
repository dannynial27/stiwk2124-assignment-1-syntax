package com.assignment1.ecommerce.repository;

import com.assignment1.ecommerce.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    // Spring Data JPA automatically provides CRUD methods
}
package com.assignment1.ecommerce.controller;

import com.assignment1.ecommerce.model.Category;
import com.assignment1.ecommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    // Get all categories
    @GetMapping
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    // Get category by ID
    @GetMapping("/{id}")
    public ResponseEntity<Category> getCategoryById(@PathVariable Long id) {
        return ResponseEntity.ok(categoryService.getCategoryById(id));
    }

    // Create a new category
    @PostMapping
    public ResponseEntity<Category> createCategory(@RequestBody Category category) {
        return new ResponseEntity<>(categoryService.createCategory(category), HttpStatus.CREATED);
    }

    // Update category
    @PutMapping("/{id}")
    public ResponseEntity<Category> updateCategory(@PathVariable Long id, @RequestBody Category categoryDetails) {
        return ResponseEntity.ok(categoryService.updateCategory(id, categoryDetails));
    }

    // Delete category
    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteCategory(@PathVariable Long id) {
        categoryService.deleteCategory(id);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}
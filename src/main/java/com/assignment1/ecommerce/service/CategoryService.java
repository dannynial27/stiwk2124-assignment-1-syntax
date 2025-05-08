package com.assignment1.ecommerce.service;

import com.assignment1.ecommerce.model.Category;
import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    Category getCategoryById(Long id);
    Category createCategory(Category category);
    Category updateCategory(Long id, Category categoryDetails);
    void deleteCategory(Long id);
}
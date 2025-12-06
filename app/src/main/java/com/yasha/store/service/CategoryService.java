package com.yasha.store.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yasha.store.exceptions.NotFoundResourceException;
import com.yasha.store.model.Category;
import com.yasha.store.repository.CategoryRepository;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(long id) {
        return categoryRepository.findById(id).
            orElseThrow(() ->
            new NotFoundResourceException("Category with ID " + id + " not found."));   
    }

    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    public void delete(long id) {
        if(!categoryRepository.existsById(id)) {
            throw new NotFoundResourceException("Category with ID " + id + " not found.");
        }
    }
}

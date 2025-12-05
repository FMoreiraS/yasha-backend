package com.yasha.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yasha.store.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}

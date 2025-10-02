package com.webApp.eStore.service;

import com.webApp.eStore.model.Category;
import com.webApp.eStore.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    public CategoryRepo repo;

    public List<Category> getAllCategory() {
        return repo.findAll();
    }

    public void addACategory(Category category){
        repo.save(category);
    }

    public void deleteCategory(int id){
        repo.deleteById(id);
    }
}

package com.ecommerce.shoppingkart.service.implementation;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.ecommerce.shoppingkart.Model.Category;
import com.ecommerce.shoppingkart.Repository.CategoryRepository;
import com.ecommerce.shoppingkart.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category saveCategory(Category category) {
        // TODO Auto-generated method stub
        return categoryRepository.save(category);
    }

    @Override
    public Boolean existCategory(String name) {
        // TODO Auto-generated method stub
        return categoryRepository.existsByName(name);
    }

    @Override
    public List<Category> getAllCategory() {
        // TODO Auto-generated method stub
       return categoryRepository.findAll();
    }

    @Override
    public Boolean deleteCategory(int id) {
        // TODO Auto-generated method stub
        Category category = categoryRepository.findById(id).orElse(null);
        if (!ObjectUtils.isEmpty(category)) {
            categoryRepository.delete(category);
            return true;
        }

        return false;
    }

    @Override
    public Category getCategoryById(int id) {
        // TODO Auto-generated method stub
       Category category = categoryRepository.findById(id).orElse(null);
       return category;
    }

  
}

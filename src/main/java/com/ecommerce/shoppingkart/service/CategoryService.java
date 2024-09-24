package com.ecommerce.shoppingkart.service;

import java.util.List;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.ecommerce.shoppingkart.Model.Category;
public interface CategoryService {
    public com.ecommerce.shoppingkart.Model.Category saveCategory(com.ecommerce.shoppingkart.Model.Category category);

	public Boolean existCategory(String name);

	public List<com.ecommerce.shoppingkart.Model.Category> getAllCategory();

	public Boolean deleteCategory(int id);

	public com.ecommerce.shoppingkart.Model.Category getCategoryById(int id);

	public List<Category> getAllActiveCategory();

	public Page<Category> getAllCategoryPagination(Integer pageNo,Integer pageSize);

}

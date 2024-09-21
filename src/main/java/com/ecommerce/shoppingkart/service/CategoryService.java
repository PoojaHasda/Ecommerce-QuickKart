package com.ecommerce.shoppingkart.service;

import java.util.List;
import java.util.Locale.Category;

public interface CategoryService {
    public com.ecommerce.shoppingkart.Model.Category saveCategory(com.ecommerce.shoppingkart.Model.Category category);

	public Boolean existCategory(String name);

	public List<com.ecommerce.shoppingkart.Model.Category> getAllCategory();

	public Boolean deleteCategory(int id);

	public com.ecommerce.shoppingkart.Model.Category getCategoryById(int id);
}

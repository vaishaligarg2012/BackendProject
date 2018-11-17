package com.backend.DAO;

import java.util.List;

import com.backend.Model.Category;

public interface CategoryDAO {
          public boolean addCategory(Category cad);
          public List<Category> getAllCategory();
}

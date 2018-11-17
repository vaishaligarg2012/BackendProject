package com.backend.DAO;

import java.util.List;

import com.backend.Model.Product;

interface ProductDAO {
        public boolean addProduct(Product p);
        public List<Product> viewAllProduct();

}

package com.backend.DAO;

import java.util.List;

import com.backend.Model.Product;

interface ProductDAO {
        public Product addProduct(Product p);
        public List<Product> viewAllProduct();

}

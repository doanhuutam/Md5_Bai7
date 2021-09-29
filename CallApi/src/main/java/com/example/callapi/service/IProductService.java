package com.example.callapi.service;

import com.example.callapi.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> finAll();
    Product findbyId(long id);
    Product save(Product product);
    void delete(long id);
}

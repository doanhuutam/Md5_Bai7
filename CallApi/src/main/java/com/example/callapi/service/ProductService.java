package com.example.callapi.service;

import com.example.callapi.model.Product;
import com.example.callapi.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
@Autowired
    IProductRepository iProductRepository;

    @Override
    public List<Product> finAll() {
        return (List<Product>) iProductRepository.findAll();
    }

    @Override
    public Product findbyId(long id) {
        return iProductRepository.findById(id).get();
    }

    @Override
    public Product save(Product product) {
        return iProductRepository.save(product);
    }

    @Override
    public void delete(long id) {
iProductRepository.deleteById(id);
    }
}

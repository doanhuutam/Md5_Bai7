package com.example.callapi.repository;

import com.example.callapi.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface IProductRepository extends CrudRepository<Product,Long> {
}

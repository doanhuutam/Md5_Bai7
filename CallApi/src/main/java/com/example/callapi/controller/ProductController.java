package com.example.callapi.controller;

import com.example.callapi.model.Product;
import com.example.callapi.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    IProductService iProductService;
    @GetMapping("")
    public ResponseEntity<List<Product>> getAll(){
return new ResponseEntity(iProductService.finAll(), HttpStatus.OK);
    }

}

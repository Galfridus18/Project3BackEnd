package com.revature.productservice.service;

import com.revature.productservice.entity.Product;
import com.revature.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product addProduct(Product product){
        return repository.save(product);
    }

    public Product getProductByName(String name){
        return repository.findByProductName(name);
    }

    public Product getProductById(Long id){
        return repository.findByProductId(id);
    }

    public List<Product> getAllProduct(){
        return repository.findAll();
    }
}

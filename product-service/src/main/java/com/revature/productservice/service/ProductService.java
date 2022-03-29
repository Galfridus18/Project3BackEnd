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

    public void updateProduct(long id, Product product){
        Product productDb = repository.findByProductId(id);
        productDb.setProductName(product.getProductName());
        productDb.setProductQty(product.getProductQty());
        productDb.setPrice(product.getPrice());
        productDb.setDescription(product.getDescription());
        repository.save(productDb);


    }
}

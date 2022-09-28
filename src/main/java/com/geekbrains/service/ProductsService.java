package com.geekbrains.service;

import com.geekbrains.entites.Product;
import com.geekbrains.entites.Student;
import com.geekbrains.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // то же сомое что аннотация Component для создания бина (обекта класса)
public class ProductsService {
    private ProductRepository productRepository;

    public ProductsService() {
    }


    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository= productRepository;
    }

    public List<Product> getAllListProduct(){
        return productRepository.getListproduct();

    }

    public void addNewProduct(Product product){
        productRepository.addProduct(product);
    }


    public Product getByIDProduct(int id){
        return productRepository.forIdListProduct(id);
    }


}
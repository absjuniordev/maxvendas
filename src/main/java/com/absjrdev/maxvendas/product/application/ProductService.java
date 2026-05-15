package com.absjrdev.maxvendas.product.application;

import com.absjrdev.maxvendas.order.domain.Order;
import com.absjrdev.maxvendas.order.repository.OrderRepository;
import com.absjrdev.maxvendas.product.domain.Product;
import com.absjrdev.maxvendas.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public
class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public
    List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Long id) {
        return productRepository.findById(id).get();
    }
}

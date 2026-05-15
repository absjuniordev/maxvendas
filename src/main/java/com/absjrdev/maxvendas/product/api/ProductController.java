package com.absjrdev.maxvendas.product.api;

import com.absjrdev.maxvendas.order.application.OrderService;
import com.absjrdev.maxvendas.order.domain.Order;
import com.absjrdev.maxvendas.product.application.ProductService;
import com.absjrdev.maxvendas.product.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public
class ProductController {

    @Autowired
    private
    ProductService productService;

    @GetMapping
    public
    ResponseEntity<List<Product>> findAll(){
        List<Product> product = productService.findAll();
        return ResponseEntity.ok().body(product);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        Product product = productService.findById(id);
        return ResponseEntity.ok().body(product);
    }
}

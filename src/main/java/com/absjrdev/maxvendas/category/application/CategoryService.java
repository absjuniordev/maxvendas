package com.absjrdev.maxvendas.category.application;

import com.absjrdev.maxvendas.category.domain.Category;
import com.absjrdev.maxvendas.category.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public
class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public
    List<Category> findAll() {
        return  categoryRepository.findAll();
    }

    public
    Category findById(Long id){
         Category obj = categoryRepository.findById(id).get();
         return obj;
    }

}

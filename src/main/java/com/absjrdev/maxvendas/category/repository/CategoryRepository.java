package com.absjrdev.maxvendas.category.repository;

import com.absjrdev.maxvendas.category.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public
interface CategoryRepository extends JpaRepository<Category,Long> {

    Optional<Category> findById(Long id);
}

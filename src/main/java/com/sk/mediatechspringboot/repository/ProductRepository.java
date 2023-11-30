package com.sk.mediatechspringboot.repository;

import com.sk.mediatechspringboot.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}

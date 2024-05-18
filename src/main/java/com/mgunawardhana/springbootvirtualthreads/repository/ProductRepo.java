package com.mgunawardhana.springbootvirtualthreads.repository;

import com.mgunawardhana.springbootvirtualthreads.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
}

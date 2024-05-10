package com.mgunawardhana.springbootvirtualthreads.controller;

import com.mgunawardhana.springbootvirtualthreads.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
@Slf4j
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public String getProducts() {
        log.info("getProducts() called");
        return "getProducts() called";
    }
}

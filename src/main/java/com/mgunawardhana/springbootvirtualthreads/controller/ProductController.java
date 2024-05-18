package com.mgunawardhana.springbootvirtualthreads.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mgunawardhana.springbootvirtualthreads.entity.Product;
import com.mgunawardhana.springbootvirtualthreads.repository.ProductRepo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
@Slf4j
public class ProductController {

    @Autowired
    private ProductRepo productRepository;

    /**
     * Platform Threads:
     * Platform threads, also known as native threads or OS threads, are threads that are managed by the operating system.
     * Each platform thread corresponds to a physical thread of execution and is scheduled by the operating system's scheduler.
     * They are heavyweight in nature, meaning they consume more resources and have a higher context-switching cost.
     * In Java, the `java.lang.Thread` class represents a platform thread.
     * <p>
     * Virtual Threads:
     * Virtual threads, also known as lightweight or user-mode threads, are threads that are managed by the runtime or a library,
     * not by the operating system. They are lightweight in nature, meaning they consume fewer resources and have a lower
     * context-switching cost compared to platform threads. Virtual threads can be mapped to a smaller set of platform threads,
     * allowing a large number of virtual threads to be run concurrently. In Java, virtual threads are introduced as a part of
     * Project Loom (which is not yet part of any official Java release as of JDK 17).
     */

    @GetMapping
    public List<Product> getProducts() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Thread info: {}", Thread.currentThread());
        return productRepository.findAll();
    }
}

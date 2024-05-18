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
     * if we don't use virtual threads, the output will be like below:
     * 2024-05-18T11:52:13.730+05:30 INFO 2744 --- [spring-boot-virtual-threads] [nio-8080-exec-1] c.m.s.controller.ProductController
     * : Thread info: Thread[#43,http-nio-8080-exec-1,5,main], name:http-nio-8080-exec-1
     *
     * Virtual Threads:
     * Virtual threads, also known as lightweight or user-mode threads, are threads that are managed by the runtime or a library,
     * not by the operating system. They are lightweight in nature, meaning they consume fewer resources and have a lower
     * context-switching cost compared to platform threads. Virtual threads can be mapped to a smaller set of platform threads,
     * allowing a large number of virtual threads to be run concurrently. In Java, virtual threads are introduced as a part of
     * Project Loom (which is not yet part of any official Java release as of JDK 17).
     * if we enable virtual threads, the output will be like below:
     * 2024-05-18T11:55:16.489+05:30 ERROR 3980 --- [spring-boot-virtual-threads] [omcat-handler-0] c.m.s.controller.ProductController
     * : Thread info: VirtualThread[#50,tomcat-handler-0]/runnable@ForkJoinPool-1-worker-1, name:tomcat-handler-0
     */

    @GetMapping
    public List<Product> getProducts() throws InterruptedException {
        Thread.sleep(1000);
        log.error("Thread info: {}, name:{} ", Thread.currentThread(), Thread.currentThread().getName());
        return productRepository.findAll();
    }
}

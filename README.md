# Threads in Java

In Java, a thread is a lightweight sub-process, the smallest unit of processing. It is a separate path of execution. Threads are independent, if there occurs exception in one thread, it doesn't affect other threads. It shares a common memory area.

## Types of Threads

### Platform Threads
- Platform threads are managed by the operating system. They are heavyweight, consuming more resources and having a higher context-switching cost. The `java.lang.Thread` class in Java represents a platform thread.

### Virtual Threads
- Virtual threads are managed by the runtime or a library, not by the operating system. They are lightweight, consuming fewer resources and having a lower context-switching cost. Virtual threads can be mapped to a smaller set of platform threads, allowing a large number of virtual threads to be run concurrently. Virtual threads are a part of Project Loom in Java, which is not yet part of any official Java release as of JDK 17.

### Method - GET
```
curl --location 'http://localhost:8080/api/v1/products'
```

### SQL SCRIPT

```sql
create database virtual_db; 

use virtual_db;

CREATE TABLE Product (
    product_key INT PRIMARY KEY,
    product_name VARCHAR(50),
    product_description VARCHAR(50),
    product_price double
);

INSERT INTO Product (product_key, product_name, product_description, product_price)
VALUES 
    (1, 'Product 1', 'Description 1', 10.50),
    (2, 'Product 2', 'Description 2', 20.00),
    (3, 'Product 3', 'Description 3', 15.75),
    (4, 'Product 4', 'Description 4', 16.25),
    (5, 'Product 5', 'Description 5', 18.00),
    (6, 'Product 6', 'Description 6', 22.75),
    (7, 'Product 7', 'Description 7', 12.99),
    (8, 'Product 8', 'Description 8', 24.50),
    (9, 'Product 9', 'Description 9', 14.75),
    (10, 'Product 10', 'Description 10', 30.00);
   

```

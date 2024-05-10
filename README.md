```
curl --location 'http://localhost:8080/api/v1/products'
```

- SQL SCRIPT

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
    (10, 'Product 10', 'Description 10', 30.00),
    (11, 'Product 11', 'Description 11', 17.25),
    (12, 'Product 12', 'Description 12', 11.50),
    (13, 'Product 13', 'Description 13', 21.75),
    (14, 'Product 14', 'Description 14', 19.99),
    (15, 'Product 15', 'Description 15', 26.50),
    (16, 'Product 16', 'Description 16', 13.25),
    (17, 'Product 17', 'Description 17', 9.99),
    (18, 'Product 18', 'Description 18', 28.75),
    (19, 'Product 19', 'Description 19', 23.00),
    (20, 'Product 20', 'Description 20', 32.50),
    (21, 'Product 21', 'Description 21', 27.75),
    (22, 'Product 22', 'Description 22', 14.99),
    (23, 'Product 23', 'Description 23', 31.25),
    (24, 'Product 24', 'Description 24', 29.50),
    (25, 'Product 25', 'Description 25', 34.00),
    (26, 'Product 26', 'Description 26', 16.75),
    (27, 'Product 27', 'Description 27', 12.50),
    (28, 'Product 28', 'Description 28', 36.75),
    (29, 'Product 29', 'Description 29', 33.99),
    (30, 'Product 30', 'Description 30', 25.99);


```

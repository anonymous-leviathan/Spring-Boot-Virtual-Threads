- Method - GET
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
    (10, 'Product 10', 'Description 10', 30.00);
   

```

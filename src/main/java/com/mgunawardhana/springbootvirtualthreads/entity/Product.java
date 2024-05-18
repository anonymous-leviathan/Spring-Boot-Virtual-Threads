package com.mgunawardhana.springbootvirtualthreads.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Setter
@Getter
public class Product {
    @Id
    private int product_key;
    private String product_name;
    private String product_description;
    private double product_price;
}

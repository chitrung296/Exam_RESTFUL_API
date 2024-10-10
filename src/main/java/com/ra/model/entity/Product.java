package com.ra.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;

@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer productId;
    @Column(name = "product_description",length = 255)
    private String productDescription;
    @Column(name = "product_image_url",length = 255)
    private String productImageUrl;
    @Column(name = "product_name",length = 100,nullable = false,unique = true)
    private String productName;
    @Column(name = "price")
    private Double price;
    @Column(name = "product_status")
    private boolean productStatus;
    @ManyToOne
    @JoinColumn(name = "category_id",referencedColumnName = "id")
    private Category category;

}

package com.ra.model.dto.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductResponseDTO {
    private Integer productId;
    private String productDescription;
    private String productImageUrl;
    private String productName;
    private Double price;
    private boolean productStatus;
    private String categoryName;

    public ProductResponseDTO(Integer productId, String productDescription, String productImageUrl, String productName, Double price, String categoryName) {
    }
}

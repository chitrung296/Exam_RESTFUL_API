package com.ra.service.product;

import com.ra.model.dto.product.ProductResponseDTO;
import com.ra.model.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
    Page<ProductResponseDTO> findAll(Pageable pageable);
    Product findById(Integer id);
    Product save(Product product);
    void delete(Integer id);

    boolean existsById(Integer id);
}
package com.ra.service.product;

import com.ra.model.dto.product.ProductResponseDTO;
import com.ra.model.entity.Product;
import com.ra.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImp implements ProductService{
    @Autowired
    private ProductRepository productRepository;
    @Override
    public Page<ProductResponseDTO> findAll(Pageable pageable) {

        List<Product> products = this.productRepository.findAll();
        List<ProductResponseDTO> list = products.stream().map(entity->
                new ProductResponseDTO(entity.getProductId(),
                        entity.getProductDescription(),
                        entity.getProductImageUrl(),
                        entity.getProductName(),
                        entity.getPrice(),
                        entity.getCategory().getCategoryName())).collect(Collectors.toList());
        return new PageImpl<>(list,pageable,list.size());
    }

    @Override
    public Product findById(Integer id) {
        return null;
    }

    @Override
    public Product save(Product product) {
        return this.productRepository.save(product);
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public boolean existsById(Integer id) {
        return false;
    }

}

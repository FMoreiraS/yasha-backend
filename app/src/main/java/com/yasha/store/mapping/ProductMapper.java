package com.yasha.store.mapping;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

import com.yasha.store.dto.ProductResponseDTO;
import com.yasha.store.dto.ProductSaveDTO;
import com.yasha.store.entity.Product;

@Mapper(componentModel = ComponentModel.SPRING) 
public interface ProductMapper {
    public Product toEntity(ProductSaveDTO productSaveDTO);
    public ProductResponseDTO toDTO(Product product);
} 

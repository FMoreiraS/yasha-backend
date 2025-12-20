package com.yasha.store.dto;

public record ProductSaveDTO(String name, Long price, Long oldPrice, String description) {
}

package com.portifolio.magnum.quarkus.dto;

import com.portifolio.magnum.quarkus.model.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDTO implements Serializable {
    private Long id;
    public String name;
    public String sector;
    public String brand;
    public Double price;

    public ProductDTO(Product product) {
        Product.builder()
                .id(product.getId())
                .name(product.getName())
                .brand(product.getBrand())
                .price(product.getPrice());
    }

}

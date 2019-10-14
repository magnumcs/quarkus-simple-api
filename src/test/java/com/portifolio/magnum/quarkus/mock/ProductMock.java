package com.portifolio.magnum.quarkus.mock;

import com.portifolio.magnum.quarkus.dto.ProductDTO;
import com.portifolio.magnum.quarkus.model.Product;

public class ProductMock {

    public static Product createProduct() {
        Product product = new Product();
        product.setId(1L);
        product.setName("Tênis");
        product.setBrand("Nike");
        product.setPrice(100.0);
        return product;
    }

    public static ProductDTO createProductDTO() {
        Product product = new Product();
        product.setId(1L);
        product.setName("Tênis");
        product.setBrand("Nike");
        product.setPrice(100.0);
        return new ProductDTO(product);
    }

}

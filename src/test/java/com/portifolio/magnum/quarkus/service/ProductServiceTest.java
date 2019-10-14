package com.portifolio.magnum.quarkus.service;

import com.portifolio.magnum.quarkus.dto.ProductDTO;
import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.h2.H2DatabaseTestResource;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static com.portifolio.magnum.quarkus.mock.ProductMock.*;

@QuarkusTestResource(H2DatabaseTestResource.class)
@QuarkusTest
public class ProductServiceTest {

    @Inject
    ProductService productService;

    @Test
    public void deveSalvarProduto() {
        ProductDTO product = createProductDTO();
        productService.saveProduct(product);
    }

}

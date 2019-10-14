package com.portifolio.magnum.quarkus.service.Imp;

import com.portifolio.magnum.quarkus.dto.ProductDTO;
import com.portifolio.magnum.quarkus.model.Product;
import com.portifolio.magnum.quarkus.repository.ProductRepository;
import com.portifolio.magnum.quarkus.service.ProductService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

@ApplicationScoped
public class ProductServiceImp implements ProductService {

    @Inject
    private ProductRepository productRepository;

    @Override
    @Transactional
    public void saveProduct(ProductDTO productDTO) {
        productRepository.persist(new Product(productDTO));
    }
}

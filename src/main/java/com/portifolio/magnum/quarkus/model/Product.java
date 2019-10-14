package com.portifolio.magnum.quarkus.model;

import com.portifolio.magnum.quarkus.dto.ProductDTO;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "product")
public class Product extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name_product")
    public String name;
    @Column(name = "sector_product")
    public String sector;
    @Column(name = "brand_product")
    public String brand;
    @Column(name = "price_product")
    public Double price;

    public Product(ProductDTO productDTO) {
        ProductDTO.builder()
                .name(productDTO.getName())
                .brand(productDTO.getBrand())
                .price(productDTO.getPrice());
    }

}

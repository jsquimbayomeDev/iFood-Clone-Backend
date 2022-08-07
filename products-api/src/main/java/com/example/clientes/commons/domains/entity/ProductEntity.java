package com.example.clientes.commons.domains.entity;

import lombok.*;

import javax.persistence.*;

@Builder(builderMethodName = "newInstance")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "product")
public class ProductEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProduct;

    @Column(name = "name_product")
    private String nameProduct;

    @Column(name = "cod_type_product")
    private String codTypeProduct;

    @Column(name = "cod_restaurant_product")
    private String codRestaurantProduct;

    @Column(name = "price_product")
    private Integer priceProduct;

    @Column(name = "description_product")
    private String descriptionProduct;

    @Column(name = "image_product")
    private String imageProduct;


    @Column(name = "discount_product")
    private String discountProduct;

    @Column(name = "is_ofert_product")
    private boolean isOfert;


}

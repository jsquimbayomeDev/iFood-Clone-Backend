package com.example.clientes.commons.domains.generic;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class ProductDTO {

    private Integer idProduct;
    private String nameProduct;
    private String idTypeProduct;
    private String idRestaurantProduct;
    private Integer priceProduct;
    private String descritionProduct;
    private String imageProduct;
    private String discountProduct;
    private boolean isOfert;

}

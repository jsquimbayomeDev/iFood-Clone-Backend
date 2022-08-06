package com.example.clientes.commons.domains.generic;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class ProductDTO {

    private String idProducto;
    private String nameProducto;
    private String typeProducto;
    private boolean estaEnOferta;
    private Integer priceProduct;

}

package com.example.clientes.commons.domains.entity;

import lombok.*;

import javax.persistence.*;

@Builder(builderMethodName = "newInstance")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "col_product")
public class ProductEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProducto;

    @Column(name = "name_product")
    private String nameProducto;

    @Column(name = "type_product")
    private String typeProducto;

    @Column(name = "estaEnOferta_product")
    private boolean estaEnOferta;

    @Column(name = "price_product")
    private Integer priceProduct;
}

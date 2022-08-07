package com.example.clientes.service.products.impl;

import com.example.clientes.commons.domains.entity.ProductEntity;
import com.example.clientes.commons.domains.generic.GenericResponseDTO;
import com.example.clientes.commons.domains.generic.ProductDTO;
import com.example.clientes.commons.repository.ProductRepository;
import com.example.clientes.service.products.IProductsServices;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
@Log4j2
public class ProductsServices implements IProductsServices {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public ResponseEntity<GenericResponseDTO> createProduct(ProductDTO productDTO) {
        return null;
    }

    @Override
    public ResponseEntity<GenericResponseDTO> getProducts() {
        return null;
    }

    @Override
    public ResponseEntity<GenericResponseDTO> getProduct(String idProduct) {
        return null;
    }

    @Override
    public ResponseEntity<GenericResponseDTO> updateProduct(ProductDTO productDTO) {
        return null;
    }

    @Override
    public ResponseEntity<GenericResponseDTO> deleteProduct(String idProduct) {
        return null;
    }
}

package com.example.clientes.service.products;

import com.example.clientes.commons.domains.generic.GenericResponseDTO;
import com.example.clientes.commons.domains.generic.ProductDTO;
import org.springframework.http.ResponseEntity;

public interface IProductsServices {
    ResponseEntity<GenericResponseDTO> createProduct(ProductDTO productDTO);

    ResponseEntity<GenericResponseDTO> getProducts();

    ResponseEntity<GenericResponseDTO> getProduct(String idProduct);

    ResponseEntity<GenericResponseDTO> updateProduct(ProductDTO productDTO);

    ResponseEntity<GenericResponseDTO> deleteProduct(String idProduct);
}

package com.example.clientes.service.products;

import com.example.clientes.commons.domains.generic.GenericResponseDTO;
import com.example.clientes.commons.domains.generic.ProductDTO;
import org.springframework.http.ResponseEntity;

public interface IProductsServices {
    ResponseEntity<GenericResponseDTO> createClient(ProductDTO productDTO);

    ResponseEntity<GenericResponseDTO> getProduct();

    ResponseEntity<GenericResponseDTO> getProduct(String idProducto);

    ResponseEntity<GenericResponseDTO> updateProduct(ProductDTO productDTO);

    ResponseEntity<GenericResponseDTO> deleteProduct(ProductDTO productDTO);
}

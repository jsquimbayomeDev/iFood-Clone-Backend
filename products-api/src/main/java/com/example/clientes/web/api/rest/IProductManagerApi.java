package com.example.clientes.web.api.rest;

import com.example.clientes.commons.constants.IEndpointProductApi;
import com.example.clientes.commons.domains.generic.GenericResponseDTO;
import com.example.clientes.commons.domains.generic.ProductDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public interface IProductManagerApi {

    @PutMapping(IEndpointProductApi.CREATE_PRODUCT)
    ResponseEntity<GenericResponseDTO> createProduct(@RequestBody ProductDTO productDTO);

    @GetMapping( IEndpointProductApi.GET_PRODUCTS)
    ResponseEntity<GenericResponseDTO> getProducts();

    @PutMapping(IEndpointProductApi.UPDATE_PRODUCT_CODE_PRODUCT)
    ResponseEntity<GenericResponseDTO> updateProduct(@RequestBody ProductDTO productDTO);

    @DeleteMapping(IEndpointProductApi.DELETE_PRODUCT_CODE_PRODUCT)
    ResponseEntity<GenericResponseDTO> deleteProduct(@PathVariable String idTask);
}

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
    @Modifying
    public ResponseEntity<GenericResponseDTO> createClient(ProductDTO productDTO) {
        ProductEntity productEntity  = new ProductEntity();
        try{
            productEntity.setIdProducto(Integer.parseInt(productDTO.getIdProducto()));
            productEntity.setPriceProduct(productDTO.getPriceProduct());
            productEntity.setNameProducto(productDTO.getNameProducto());
            productEntity.setTypeProducto(productDTO.getTypeProducto());
            productEntity.setEstaEnOferta(productEntity.isEstaEnOferta());
            productRepository.save(productEntity);
            return new ResponseEntity<>(GenericResponseDTO.builder()
                    .message("producto creado")
                    .objectResponse(productDTO)
                    .statusCode(HttpStatus.OK.value())
                    .build(), HttpStatus.OK);

        }catch (Exception e){
            log.error("Fallo al guardar el producto " + e);
            return new ResponseEntity<>(GenericResponseDTO.builder()
                    .message("Error creando producto:  " + e.getMessage())
                    .objectResponse(null)
                    .statusCode(HttpStatus.BAD_REQUEST.value())
                    .build(), HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<GenericResponseDTO> getProduct() {
        List<ProductEntity> productEntity = new ArrayList();
        List<ProductDTO> productDTOS = new ArrayList();
        try{
            //me estoy trallendo todos los productos
            productEntity = productRepository.findAll();
            if(!productEntity.isEmpty()){
                //convertirlos a DTO
                for (ProductEntity product: productEntity) {
                    ProductDTO productDTO = new ProductDTO();
                    productDTO.setIdProducto(product.getIdProducto().toString());
                    productDTO.setPriceProduct(product.getPriceProduct());
                    productDTO.setNameProducto(product.getNameProducto());
                    productDTO.setTypeProducto(product.getTypeProducto());
                    productDTO.setEstaEnOferta(product.isEstaEnOferta());
                    productDTOS.add(productDTO);
                }

            }
            return new ResponseEntity<>(GenericResponseDTO.builder()
                    .message("productDTOS encontrados")
                    .objectResponse(productDTOS)
                    .statusCode(HttpStatus.OK.value())
                    .build(), HttpStatus.OK);
        }catch (Exception e){
            log.error("Fallo al encontrar el producto " + e);
            return new ResponseEntity<>(GenericResponseDTO.builder()
                    .message("Error creando producto:  " + e.getMessage())
                    .objectResponse(null)
                    .statusCode(HttpStatus.BAD_REQUEST.value())
                    .build(), HttpStatus.BAD_REQUEST);
        }
    }


    @Override
    public ResponseEntity<GenericResponseDTO> getProduct(String idProducto) {
        Optional<ProductEntity> productEntity;
        ProductDTO productDTO = new ProductDTO();
        try{
            productEntity = productRepository.findByIdProducto(Integer.parseInt(idProducto));
            if(productEntity.isPresent()){
                productDTO.setIdProducto(productEntity.get().getIdProducto().toString());
                productDTO.setPriceProduct(productEntity.get().getPriceProduct());
                productDTO.setNameProducto(productEntity.get().getNameProducto());
                productDTO.setTypeProducto(productEntity.get().getTypeProducto());
                productDTO.setEstaEnOferta(productEntity.get().isEstaEnOferta());
            } return new ResponseEntity<>(GenericResponseDTO.builder()
                    .message("productDTOS encontrados")
                    .objectResponse(productDTO)
                    .statusCode(HttpStatus.OK.value())
                    .build(), HttpStatus.OK);

        }catch (Exception e){
            log.error("Fallo al encontrar el producto " + e);
            return new ResponseEntity<>(GenericResponseDTO.builder()
                    .message("Error creando producto:  " + e.getMessage())
                    .objectResponse(null)
                    .statusCode(HttpStatus.BAD_REQUEST.value())
                    .build(), HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<GenericResponseDTO> updateProduct(ProductDTO productDTO) {
        return null;
    }

    @Override
    public ResponseEntity<GenericResponseDTO> deleteProduct(ProductDTO productDTO) {
        return null;
    }

}

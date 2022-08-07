package com.example.clientes.web.api.rest.impl;

import com.example.clientes.commons.constants.IEndpointProductApi;
import com.example.clientes.commons.constants.ResponseMassage;
import com.example.clientes.commons.domains.generic.GenericResponseDTO;
import com.example.clientes.commons.domains.generic.ProductDTO;
import com.example.clientes.service.products.IProductsServices;
import com.example.clientes.web.api.rest.IProductManagerApi;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(IEndpointProductApi.BASE_URL)
@CrossOrigin(origins = "*", methods = {RequestMethod.DELETE, RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})
@Log4j2
public class ProductManagerApiImpl implements IProductManagerApi {

    private final IProductsServices iProductsServices;

    public ProductManagerApiImpl(IProductsServices iProductsServices) {
        this.iProductsServices = iProductsServices;
    }


    @Override
    @PostMapping(IEndpointProductApi.CREATE_PRODUCT)
    @ApiOperation(value = "guardar una tarea de usuario con sus datos", notes = "metodo para guardar una tarea")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = ResponseMassage.CREATE_SUCCESS, response = GenericResponseDTO.class),
            @ApiResponse(code = 400, message = ResponseMassage.CREATE_FAIL, response = String.class),
            @ApiResponse(code = 500, message = ResponseMassage.INTERNAL_SERVER)})
    public ResponseEntity<GenericResponseDTO> createProduct(ProductDTO productDTO) {
        return  iProductsServices.createProduct(productDTO) ;
    }

    @Override
    @GetMapping(IEndpointProductApi.GET_PRODUCTS)
    @ApiOperation(value = "Obtiene todas las tareas asociadas a un usuario", notes = "obtiene una tarea")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = ResponseMassage.GET_SUCCESS, response = GenericResponseDTO.class),
            @ApiResponse(code = 400, message = ResponseMassage.GET_FAIL, response = String.class),
            @ApiResponse(code = 500, message = ResponseMassage.INTERNAL_SERVER)})
    public ResponseEntity<GenericResponseDTO> getProducts() {
        return iProductsServices.getProducts();
    }

    @Override
    @PostMapping(IEndpointProductApi.UPDATE_PRODUCT_CODE_PRODUCT)
    @ApiOperation(value = "actualiza tarea asociada a un usuario por id", notes = "actualiza una tarea")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = ResponseMassage.UPDATE_SUCCESS, response = GenericResponseDTO.class),
            @ApiResponse(code = 400, message = ResponseMassage.UPDATE_FAIL, response = String.class),
            @ApiResponse(code = 500, message = ResponseMassage.INTERNAL_SERVER)})
    public ResponseEntity<GenericResponseDTO> updateProduct(ProductDTO productDTO) {
        return iProductsServices.updateProduct(productDTO);
    }

    @Override
    @DeleteMapping(IEndpointProductApi.DELETE_PRODUCT_CODE_PRODUCT)
    @ApiOperation(value = "elimina tarea asociada a un usuario por id", notes = "elimina una tarea")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = ResponseMassage.DELETE_SUCCESS, response = GenericResponseDTO.class),
            @ApiResponse(code = 400, message = ResponseMassage.DELETE_FAIL, response = String.class),
            @ApiResponse(code = 500, message = ResponseMassage.INTERNAL_SERVER)})
    public ResponseEntity<GenericResponseDTO> deleteProduct(String idProduct) {
        return iProductsServices.deleteProduct(idProduct);
    }
}

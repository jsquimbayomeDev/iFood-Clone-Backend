package com.example.clientes.commons.constants;

public interface IEndpointProductApi {

    String BASE_URL = "/managerTask/api/ts";

    String CREATE_PRODUCT = "/createProduct";

    String GET_PRODUCTS = "/getProducts";

    String GET_PRODUCTS_INFO = "/getProduct/{idProduct}";

    String UPDATE_PRODUCT_CODE_PRODUCT = "/updateProduct";

    String DELETE_PRODUCT_CODE_PRODUCT = "/deleteProduct/{codProduct}";

}    

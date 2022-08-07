
package com.example.clientes.commons.repository;

import com.example.clientes.commons.domains.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {

    @Override
    List<ProductEntity> findAll();

    Optional<ProductEntity> findByCodTypeProduct(String codTypeProduct);

    Optional<ProductEntity> findByIdProduct(Integer nameProduct);

}

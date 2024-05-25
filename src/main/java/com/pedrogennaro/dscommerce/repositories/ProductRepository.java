package com.pedrogennaro.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrogennaro.dscommerce.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

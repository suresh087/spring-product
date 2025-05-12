package com.product.productRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.product.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	List<Product> getAllProducts();

	void addProduct(Product product);

}


	



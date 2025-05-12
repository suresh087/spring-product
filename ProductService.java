package com.product.productService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.product.product.Product;
import com.product.productRepository.ProductRepository;

@Service
public class ProductService {
	
	
	    private ProductRepository productRepository;

	    public ProductService(ProductRepository productRepository) {
	        this.productRepository = productRepository;
	    }

	    public void addProduct(String name, double price, String category) {
	        Product product = new Product();
	        productRepository.addProduct(product);
	    }
	    

	    public List<Product> getAllProducts() {
	        return productRepository.findAll();
	    }
	}




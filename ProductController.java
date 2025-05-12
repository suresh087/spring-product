package com.product.productController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.product.product.Product;
import com.product.productService.ProductService;


	@Controller
	@RequestMapping("/")
	public class ProductController {
		
	    private ProductService productService;

	    public ProductController(ProductService productService) {
	        this.productService = productService;
	    }

	    @GetMapping("/index")
	    public String index() {
	        return "index";
	    }

	    @GetMapping("/add-product")
	    public String addProductForm(Model model) {
	        model.addAttribute("product", new Product());
	        return "add-product";
	    }
	   
	    @PostMapping("/add-product")
	    public String addProduct(Product product) {
	        productService.addProduct(product.getName(), product.getPrice(), product.getCategory());
	        return "redirect:/product-list";
	    }

	    @GetMapping("/product-list")
	    public String productList(Model model) {
	        model.addAttribute("products", productService.getAllProducts());
	        return "product-list";
	    }
	}




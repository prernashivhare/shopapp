package com.shopping.ShoppingApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.ShoppingApp.beans.Product;
import com.shopping.ShoppingApp.service.ShopService;


@RestController
public class Controller {

	
	@Autowired
	private ShopService shopService;
	
	@PostMapping(value="/addProduct")
	@CrossOrigin
    public String addProduct(@RequestBody Product prod) {
		shopService.addProduct(prod);
		return "Product added successfully";
	}
	
	@GetMapping(value="/getAllProducts")
	@CrossOrigin
    public List<Product> getAllProducts() {
		return shopService.getAllProducts();
	}
	
	@PutMapping(value="/updateProduct")
	@CrossOrigin
    public String updateProduct(@RequestBody Product prod) {
		shopService.updateProduct(prod);
		return "Product updated successfully";
	}
	
	@DeleteMapping(value="/deleteProduct")
	@CrossOrigin
    public String deleteProduct(@RequestBody Product prod) {
		shopService.deleteProduct(prod);
		return "Product deleted";
	}
	
}

package com.shopping.ShoppingApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.ShoppingApp.Repository.ShopRepo;
import com.shopping.ShoppingApp.beans.Product;

@Service
public class ShopService {
	
	@Autowired
	private ShopRepo repository;
	
	public void addProduct(Product prod) {
		repository.save(prod);
	}

	public List<Product> getAllProducts() {
		return (List<Product>) repository.findAll();
	}
	
	public void updateProduct(Product prod) {
		repository.save(prod);
	}
	
	public void deleteProduct(Product prod) {
		repository.delete(prod);;
	}
	
}

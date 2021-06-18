package com.shopping.ShoppingApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.shopping.ShoppingApp.beans.Product;

public interface ShopRepo extends CrudRepository<Product, Integer>{
	
}

package com.shopping.ShoppingApp.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	/*
	{"id":1,"title":"Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops","price":109.95,"description":"Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday","category":"men's clothing","image":"https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg"}
	**/
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO, generator="product_id_seq")
	//@Column(columnDefinition = "serial")
	int p_id;
	
	String p_name;
	
	Long p_price;
	
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public Long getP_price() {
		return p_price;
	}
	public void setP_price(Long p_price) {
		this.p_price = p_price;
	}
	@Override
	public String toString() {
		return "Product [p_id=" + p_id + ", p_name=" + p_name + ", p_price=" + p_price + "]";
	}
	
	public Product() {
		
	}
	
	public Product(int p_id, String p_name, Long p_price) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_price = p_price;
	}
	
	
	
}

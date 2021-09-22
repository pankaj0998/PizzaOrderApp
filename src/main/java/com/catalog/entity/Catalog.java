package com.catalog.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Catalog {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="item_id")
	private long itemId;
	@Column(name="item_name")
	private String itemName;
	
	private Float price;
	
    // Default Constructor
	public Catalog() {
		
	}

	//Argument Constructor
	public Catalog(Integer itemId, String itemName, Float price) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
	}

	 // Getters And Setters
	public long getItemId() {
		return itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}
	
}

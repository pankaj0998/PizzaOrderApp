package com.catalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.catalog.entity.Catalog;
import com.catalog.services.CatalogService;

@RestController
@RequestMapping("/")
public class CatalogController {
	
	@Autowired
	private CatalogService catalogservice;
	
	@GetMapping("/catalog")
	public List<Catalog> getItemsList(){
		return catalogservice.getItemsList();
	}
}

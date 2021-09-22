package com.catalog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalog.dao.CatalogDao;
import com.catalog.entity.Catalog;

@Service
public class CatalogImp implements CatalogService{

	@Autowired
	private CatalogDao catalogdao;
	@Override
	public List<Catalog> getItemsList() {
		return catalogdao.findAll();
	}

}

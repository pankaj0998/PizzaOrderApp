package com.catalog.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.catalog.entity.Catalog;

public interface CatalogDao extends JpaRepository<Catalog, Long> {

}

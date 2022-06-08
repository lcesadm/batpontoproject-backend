package com.ibm.bp.service;

import java.util.List;

import com.ibm.bp.model.entity.Brands;

public interface BrandsService {
    List<Brands> findAll();

    Long findByName(String name);

    Object findTimeById(Long id);
}

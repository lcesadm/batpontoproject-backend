package com.ibm.bp.service.serviceImpl;

import java.util.List;

import com.ibm.bp.model.entity.Brands;
import com.ibm.bp.repository.BrandsRepository;
import com.ibm.bp.service.BrandsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandsServiceImpl implements BrandsService {
    @Autowired
    private BrandsRepository brandsRepository;

    @Override
    public List<Brands> findAll() {
        return brandsRepository.findAll();
    }

    @Override
    public Long findByName(String name) {
        return brandsRepository.findByName(name);
    }

    @Override
    public Object findTimeById(Long id) {
        return brandsRepository.findTimeById(id);
    }
}

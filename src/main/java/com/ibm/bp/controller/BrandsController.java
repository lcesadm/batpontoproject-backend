package com.ibm.bp.controller;

import java.util.List;

import com.ibm.bp.model.entity.Brands;
import com.ibm.bp.service.BrandsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("brands")
public class BrandsController {
    @Autowired
    private BrandsService brandsService;

    @GetMapping
    public ResponseEntity<List<Brands>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(brandsService.findAll());
    }

    @GetMapping("/findByName/{name}")
    public ResponseEntity<Long> findByName(@PathVariable String name) {
        return ResponseEntity.status(HttpStatus.OK).body(brandsService.findByName(name));
    }

    @GetMapping("/findTimeById/{id}")
    public ResponseEntity<Object> findTimeById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(brandsService.findTimeById(id));
    }
}

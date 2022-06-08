package com.ibm.bp.repository;

import com.ibm.bp.model.entity.Brands;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BrandsRepository extends JpaRepository<Brands, Long> {
    @Query(value = "SELECT brand_id FROM brands WHERE brand_name = :name", nativeQuery = true)
    Long findByName(@Param("name") String name);

    @Query(value = "SELECT min_work_time, marks FROM brands WHERE brand_id = :id", nativeQuery = true)
    Object findTimeById(@Param("id") Long id);
}

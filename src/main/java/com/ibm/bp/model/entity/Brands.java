package com.ibm.bp.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "brands")
public class Brands {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "brand_id")
    private Long brandId;
       
    @Column(name = "brand_name")
    private String brandName;

    @Column(name = "min_work_time")
    private Long minWorkTime;

    @Column(name = "marks")
    private Long marks;
    
    
    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Long getMinWorkTime() {
        return minWorkTime;
    }

    public void setMinWorkTime(Long minWorkTime) {
        this.minWorkTime = minWorkTime;
    }

    public Long getMarks() {
        return marks;
    }

    public void setMarks(Long marks) {
        this.marks = marks;
    }
}

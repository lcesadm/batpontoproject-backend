package com.ibm.bp.service;

import java.sql.Date;
import java.util.List;

import com.ibm.bp.model.entity.HoursCard;

public interface HoursCardService {
    HoursCard save(HoursCard hours);
    
    List<String> findAllByUserId(Long id);

    List<Object> findAllByMonth(Long id, String start, String end);

    Object findByDate(Long id, Date date);
}

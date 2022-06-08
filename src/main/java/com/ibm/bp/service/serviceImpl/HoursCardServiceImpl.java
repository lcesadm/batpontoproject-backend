package com.ibm.bp.service.serviceImpl;

import java.sql.Date;
import java.util.List;

import com.ibm.bp.model.entity.HoursCard;
import com.ibm.bp.repository.HoursCardRepository;
import com.ibm.bp.service.HoursCardService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HoursCardServiceImpl implements HoursCardService {
    @Autowired
    private HoursCardRepository hoursCardRepository;

    @Override
    public HoursCard save(HoursCard hours) {
        return hoursCardRepository.save(hours);
    }

    @Override
    public List<String> findAllByUserId(Long id) {
        return hoursCardRepository.findAllByUserId(id);
    }

    @Override
    public List<Object> findAllByMonth(Long id, String start, String end) {
        return hoursCardRepository.findAllByMonth(id, start, end);
    
    }
    @Override
    public Object findByDate(Long id, Date date) {
        return hoursCardRepository.findByDate(id, date);
    }
}

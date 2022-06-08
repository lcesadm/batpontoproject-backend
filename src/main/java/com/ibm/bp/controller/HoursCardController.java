package com.ibm.bp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.List;

import com.ibm.bp.model.entity.HoursCard;
import com.ibm.bp.service.HoursCardService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("hoursCard")
public class HoursCardController {
    @Autowired
    private HoursCardService hoursCardService;

    @GetMapping("/findAllByUserId/{id}")
    public ResponseEntity<List<String>> findAllByUserId(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(hoursCardService.findAllByUserId(id));
    }

    @GetMapping("/findAllByMonth/{id}/{start}/{end}")
    public ResponseEntity<List<Object>> findAllByMonth(@PathVariable Long id, @PathVariable String start, @PathVariable String end) {
        return ResponseEntity.status(HttpStatus.OK).body(hoursCardService.findAllByMonth(id, start, end));
    }

    @GetMapping("/findByDate/{id}/{date}")
    public ResponseEntity<Object> findByDate(@PathVariable Long id, @PathVariable Date date) {
        return ResponseEntity.status(HttpStatus.OK).body(hoursCardService.findByDate(id, date));
    }

    @PostMapping
    public ResponseEntity<HoursCard> insertValues(@RequestBody HoursCard HoursCard) {
        return ResponseEntity.status(HttpStatus.CREATED).body(hoursCardService.save(HoursCard));
    }
}

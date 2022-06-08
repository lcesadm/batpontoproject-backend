package com.ibm.bp.model.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hours_card")
public class HoursCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     
    @Column(name = "hours_card_id")
    private Long hoursCardId;
     
    @Column(name = "input_time")
    private String inputTime;
        
    @Column(name = "output_time")
    private String outputTime;
    
    @Column(name = "worked_time")
    private Long workedTime;
    
    @Column(name = "extra_time")
    private Long extraTime;
    
    @Column(name = "actual_date")
    private Date actualDate;

    @Column(name = "finished_day")
    private Boolean finishedDay;
    
    @Column(name = "mark_counter")
    private Long markCounter;

    @Column(name = "user_id")
    private Long userId;
    
    
    public Long getHoursCardId() {
        return hoursCardId;
    }

    public void setHoursCardId(Long hoursCardId) {
        this.hoursCardId = hoursCardId;
    }

    public String getInputTime() {
        return inputTime;
    }

    public void setInputTime(String inputTime) {
        this.inputTime = inputTime;
    }

    public String getOutputTime() {
        return outputTime;
    }
    
    public void setOutputTime(String outputTime) {
        this.outputTime = outputTime;
    }

    public Long getWorkedTime() {
        return workedTime;
    }

    public void setWorkedTime(Long workedTime) {
        this.workedTime = workedTime;
    }

    public Long getExtraTime() {
        return extraTime;
    }

    public void setExtraTime(Long extraTime) {
        this.extraTime = extraTime;
    }

    public Date getActualDate() {
        return actualDate;
    }
    
    public void setActualDate(Date actualDate) {
        this.actualDate = actualDate;
    }

    public Boolean getFinishedDay() {
        return finishedDay;
    }

    public void setFinishedDay(Boolean finishedDay) {
        this.finishedDay = finishedDay;
    }

    public Long getMarkCounter() {
        return markCounter;
    }

    public void setMarkCounter(Long markCounter) {
        this.markCounter = markCounter;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}

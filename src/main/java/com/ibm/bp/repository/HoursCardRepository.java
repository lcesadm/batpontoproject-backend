package com.ibm.bp.repository;

import java.sql.Date;
import java.util.List;

import com.ibm.bp.model.entity.HoursCard;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface HoursCardRepository extends JpaRepository<HoursCard, Long> {
    @Query(value = "SELECT actual_date FROM hours_card WHERE user_id = :id AND finished_day = TRUE", nativeQuery = true)
    List<String> findAllByUserId(@Param("id") Long id);

    @Query(value = "SELECT hours_card_id, input_time, output_time, worked_time, extra_time, actual_date FROM hours_card WHERE user_id = :id AND actual_date >= :start AND actual_date <= :end", nativeQuery = true)
    List<Object> findAllByMonth(@Param("id") Long id, @Param("start") String start, @Param("end") String end);

    @Query(value = "SELECT hours_card_id, input_time, output_time, worked_time, extra_time, finished_day, mark_counter FROM hours_card WHERE user_id = :id AND actual_date = :date", nativeQuery = true)
    Object findByDate(@Param("id") Long id, @Param("date") Date date);
}

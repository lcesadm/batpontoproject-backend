package com.ibm.bp.repository;

import com.ibm.bp.model.entity.Users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UsersRepository extends JpaRepository<Users, Long> {
    @Query(value = "SELECT user_id, full_name, brand_id FROM users WHERE email = :email AND password = :password", nativeQuery = true)
    Object findByLogin(@Param("email") String email, @Param("password") String password);

    @Query(value = "SELECT email FROM users WHERE email = :email", nativeQuery = true)
    String verifyEmail(@Param("email") String email);
}

package com.ibm.bp.service;

import com.ibm.bp.model.entity.Users;

public interface UsersService {
    Users save(Users users);
    
    Object findByLogin(String email, String password);

    String verifyEmail(String email);
}

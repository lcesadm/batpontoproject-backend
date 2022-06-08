package com.ibm.bp.service.serviceImpl;

import com.ibm.bp.model.entity.Users;
import com.ibm.bp.repository.UsersRepository;
import com.ibm.bp.service.UsersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersRepository usersRepository;

    @Override
    public Users save(Users users) {
        return usersRepository.save(users);
    }

    @Override
    public Object findByLogin(String email, String password) {
        return usersRepository.findByLogin(email, password);
    }

    @Override
    public String verifyEmail(String email) {
        return usersRepository.verifyEmail(email);
    }
}

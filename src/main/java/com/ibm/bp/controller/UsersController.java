package com.ibm.bp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.bp.model.entity.Users;
import com.ibm.bp.service.UsersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("users")
public class UsersController {
    @Autowired
    private UsersService usersService;

    @GetMapping("/findByLogin/{email}/{password}")
    public ResponseEntity<Object> findByLogin(@PathVariable String email, @PathVariable String password) {
        return ResponseEntity.status(HttpStatus.OK).body(usersService.findByLogin(email, password));
    }

    @GetMapping("/verifyEmail/{email}")
    public Boolean verifyEmail(@PathVariable String email) {
        return (usersService.verifyEmail(email) == null);
    }

    @PostMapping
    public ResponseEntity<Users> insertValues(@RequestBody Users users) {
        return ResponseEntity.status(HttpStatus.CREATED).body(usersService.save(users));
    }
}

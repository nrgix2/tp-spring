package com.j2ee.tdspring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.j2ee.tdspring.entities.Users;
import com.j2ee.tdspring.services.UsersService;


@RestController
public class UsersController {
    @Autowired
    private UsersService usersService;

    @GetMapping(path = "/users")
    public Users getUser(@RequestParam(value = "id") Integer id) {
        return usersService.getUsersById(id);
    }

    @PutMapping("/users")
    public Users addOrUpdateUsers(@RequestBody Users user) {
        return usersService.createOrUpdate(user);
    }

    @GetMapping("/users/all")
    public List<Users> getUsers() {
        return usersService.getUsers();
    }

    @DeleteMapping("/users")
    public void deleteUsers(@RequestParam(value = "id") Integer id) {
    	usersService.deleteUserById(id);
    }
}

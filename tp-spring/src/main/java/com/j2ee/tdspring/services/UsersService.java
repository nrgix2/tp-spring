package com.j2ee.tdspring.services;

import com.j2ee.tdspring.entities.Patients;
import com.j2ee.tdspring.entities.Users;
import com.j2ee.tdspring.repositories.PatientsRepository;
import com.j2ee.tdspring.repositories.UsersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService{
    @Autowired
    private UsersRepository usersRepository;


    public Users createOrUpdate(Users user) {
        return usersRepository.save(user);
    }

    public Users getUsersById(Integer id) {
        return usersRepository.findById(id).orElse(null);
    }

    public List<Users> getUsers() {
        return usersRepository.findAll();
    }

    public void deleteUserById(Integer id) {
    	usersRepository.deleteById(id);
    }

}

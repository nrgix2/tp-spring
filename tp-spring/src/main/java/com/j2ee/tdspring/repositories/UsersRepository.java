package com.j2ee.tdspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.j2ee.tdspring.entities.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {

}

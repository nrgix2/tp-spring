package com.j2ee.tdspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.j2ee.tdspring.entities.Messages;

public interface MessagesRepository extends JpaRepository<Messages, Integer> {

}

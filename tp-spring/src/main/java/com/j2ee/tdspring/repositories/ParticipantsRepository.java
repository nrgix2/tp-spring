package com.j2ee.tdspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.j2ee.tdspring.entities.Participants;

public interface ParticipantsRepository extends JpaRepository<Participants, Integer> {

}

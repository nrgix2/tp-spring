package com.j2ee.tdspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.j2ee.tdspring.entities.Projets;

public interface ProjetsRepository extends JpaRepository<Projets, Integer> {

}

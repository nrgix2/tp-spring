package com.j2ee.tdspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.j2ee.tdspring.entities.Patients;

public interface PatientsRepository extends JpaRepository<Patients, Integer> {

}

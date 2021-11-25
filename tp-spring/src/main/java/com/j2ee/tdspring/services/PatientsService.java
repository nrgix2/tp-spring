package com.j2ee.tdspring.services;

import com.j2ee.tdspring.entities.Patients;
import com.j2ee.tdspring.repositories.PatientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientsService{
    @Autowired
    private PatientsRepository patientsRepository;


    public Patients createOrUpdate(Patients patients) {
        return patientsRepository.save(patients);
    }

    public Patients getPatientsById(Integer id) {
        return patientsRepository.findById(id).orElse(null);
    }

    public List<Patients> getPatients() {
        return patientsRepository.findAll();
    }

    public void deletePatients(Integer id) {
    	patientsRepository.deleteById(id);
    }

}

package com.j2ee.tdspring.controllers;

import com.j2ee.tdspring.entities.Patients;
import com.j2ee.tdspring.services.PatientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientsController {
    @Autowired
    private PatientsService patientsService;

    @GetMapping(path = "/patients")
    public Patients getUser(@RequestParam(value = "id") Integer id) {
        return patientsService.getPatientsById(id);
    }

    @PutMapping("/patients")
    public Patients addOrUpdatePatients(@RequestBody Patients patients) {
        return patientsService.createOrUpdate(patients);
    }

    @GetMapping("/patients/all")
    public List<Patients> getPatients() {
        return patientsService.getPatients();
    }

    @DeleteMapping("/patients")
    public void deletePatients(@RequestParam(value = "id") Integer id) {
    	patientsService.deletePatients(id);
    }
}

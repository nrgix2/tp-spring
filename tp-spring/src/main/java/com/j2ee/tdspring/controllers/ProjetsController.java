package com.j2ee.tdspring.controllers;

import com.j2ee.tdspring.entities.Projets;
import com.j2ee.tdspring.services.ProjetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjetsController {
    @Autowired
    private ProjetsService projetsService;

    @GetMapping(path = "/projets")
    public Projets getUser(@RequestParam(value = "id") Integer id) {
        return projetsService.getProjetsById(id);
    }

    @PutMapping("/projets")
    public Projets addOrUpdateUser(@RequestBody Projets projets) {
        return projetsService.createOrUpdate(projets);
    }

    @GetMapping("/projets/all")
    public List<Projets> getProjets() {
        return projetsService.getProjets();
    }

    @DeleteMapping("/projets")
    public void deleteProjets(@RequestParam(value = "id") Integer id) {
    	projetsService.deleteProjets(id);
    }
}

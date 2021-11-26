package com.j2ee.tdspring.services;

import com.j2ee.tdspring.entities.Projets;
import com.j2ee.tdspring.repositories.ProjetsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetsService{
    @Autowired
    private ProjetsRepository projetsRepository;


    public Projets createOrUpdate(Projets projets) {
        return projetsRepository.save(projets);
    }

    public Projets getProjetsById(Integer id) {
        return projetsRepository.findById(id).orElse(null);
    }
    
    public Projets getParticpantsProjets(Integer id) {
        return projetsRepository.findById(id).orElse(null);
    }

    public List<Projets> getProjets() {
        return projetsRepository.findAll();
    }

    public void deleteProjets(Integer id) {
    	projetsRepository.deleteById(id);
    }

}

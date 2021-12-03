package com.j2ee.tdspring.services;

import com.j2ee.tdspring.entities.Participants;
import com.j2ee.tdspring.repositories.ParticipantsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParticipantsService{
    @Autowired
    private ParticipantsRepository participantsRepository;


    public Participants createOrUpdate(Participants participants) {
        return participantsRepository.save(participants);
    }

    public Participants getParticipantsById(Integer id) {
        return participantsRepository.findById(id).orElse(null);
    }

    public List<Participants> getParticipants() {
        return participantsRepository.findAll();
    }

    public void deleteParticipants(Integer id) {
    	participantsRepository.deleteById(id);
    }
    
    public void acceptParticipant(Integer id) {
    	participantsRepository.findById(id);
    }
    
    public void declineParticipant(Integer id) {
    	participantsRepository.findById(id);
    }
    

}

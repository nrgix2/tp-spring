package com.j2ee.tdspring.controllers;

import com.j2ee.tdspring.entities.Participants;
import com.j2ee.tdspring.services.ParticipantsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ParticipantsController {
    @Autowired
    private ParticipantsService participantsService;

    @GetMapping(path = "/participants")
    public Participants getUser(@RequestParam(value = "id") Integer id) {
        return participantsService.getParticipantsById(id);
    }

    @PutMapping("/participants")
    public Participants addOrUpdateParticipants(@RequestBody Participants participants) {
        return participantsService.createOrUpdate(participants);
    }
  /*  
    @GetMapping("/participants/accept")
    public Participants acceptParticipant(@RequestParam(value = "id") Integer id) {
        return participantsService.acceptParticipant(id);
    }
    
    @GetMapping("/participants/accept")
    public Participants declineParticipant(@RequestParam(value = "id") Integer id) {
        return participantsService.declineParticipant(id);
    }
*/
    @GetMapping("/participants/all")
    public List<Participants> getParticipants() {
        return participantsService.getParticipants();
    }

    @DeleteMapping("/participants")
    public void deleteParticipants(@RequestParam(value = "id") Integer id) {
    	participantsService.deleteParticipants(id);
    }
}

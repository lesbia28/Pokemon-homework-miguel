package com.ironhack.pokemonservice.service.impl;

import com.ironhack.pokemonservice.controller.dto.TrainerDTO;
import com.ironhack.pokemonservice.model.TeamMember;
import com.ironhack.pokemonservice.model.Trainer;
import com.ironhack.pokemonservice.repository.TrainerRepository;
import com.ironhack.pokemonservice.service.interfaces.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class TrainerServiceImpl implements TrainerService {

    @Autowired
    private TrainerRepository trainerRepository;

    @Override
    public List<Trainer> getAllTrainers() {
        return trainerRepository.findAll();
    }

    @Override
    public Trainer getTrainerByName(String name) {
        return trainerRepository.findByName(name)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Trainer Not found"));
    }

    @Override
    public Trainer getTrainerById(Long id) {
        return trainerRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Trainer Not found"));
    }

    public void addNewTrainer(TrainerDTO trainerDTO) {
        if (trainerDTO.getId() != null){
            Optional<Trainer> optionalTrainer = trainerRepository.findById(trainerDTO.getId());
            if (optionalTrainer.isPresent())
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "A trainer with code " + trainerDTO.getId() + " already exists");
        }

        Trainer trainer = new Trainer();
        trainer.setId(trainerDTO.getId());
        trainer.setName(trainerDTO.getName());
        trainer.setAge(trainerDTO.getAge());
        trainer.setCity(trainerDTO.getCity());
        trainer.setHobby(trainerDTO.getHobby());
        trainer.setPicture(trainerDTO.getPicture());

        trainerRepository.save(trainer);
    }

    public void deleteTrainer(Long id) {
        Optional<Trainer> optionalTrainer = trainerRepository.findById(id);
        if(optionalTrainer.isPresent()){
            trainerRepository.deleteById(id);
        }
        else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No Trainer found with id "+id);
        }

    }
}

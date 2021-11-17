package com.ironhack.pokemonservice.controller.interfaces;

import com.ironhack.pokemonservice.controller.dto.TeamMemberDTO;
import com.ironhack.pokemonservice.controller.dto.TrainerDTO;
import com.ironhack.pokemonservice.model.Trainer;

import java.util.List;

public interface TrainerController {
    List<Trainer> getAllTrainers();
    Trainer getTrainerByName(String name);
    Trainer getTrainerById(Long id);
    void addNewTrainer(TrainerDTO trainerDTO);
    void deleteTrainer(Long id);

}

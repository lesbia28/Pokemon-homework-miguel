package com.ironhack.pokemonservice.controller.impl;

import com.ironhack.pokemonservice.controller.dto.TrainerDTO;
import com.ironhack.pokemonservice.controller.interfaces.TrainerController;
import com.ironhack.pokemonservice.model.Trainer;
import com.ironhack.pokemonservice.service.interfaces.TeamService;
import com.ironhack.pokemonservice.service.interfaces.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TrainerControllerImpl implements TrainerController {

    @Autowired
    private TrainerService trainerService;

    @GetMapping("/pokemon/trainers-all")
    @ResponseStatus(HttpStatus.OK)
    public List<Trainer> getAllTrainers() {
        return trainerService.getAllTrainers();
    }

    @GetMapping("/pokemon/trainers")
    @ResponseStatus(HttpStatus.OK)
    public Trainer getTrainerByName(@RequestParam(name = "name") String name) {
        return trainerService.getTrainerByName(name);
    }

    @GetMapping("/pokemon/trainers/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Trainer getTrainerById(@PathVariable Long id) {
        return trainerService.getTrainerById(id);
    }

    @PostMapping("/pokemon/trainers")
    @ResponseStatus(HttpStatus.CREATED)
    public void addNewTrainer(@RequestBody TrainerDTO trainerDTO) {
        trainerService.addNewTrainer(trainerDTO);
    }

    @DeleteMapping("/pokemon/trainers/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTrainer(@PathVariable Long id) {
        trainerService.deleteTrainer(id);
    }
}

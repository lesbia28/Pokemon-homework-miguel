package com.ironhack.pokemonservice.service.interfaces;

import com.ironhack.pokemonservice.controller.dto.RequestTeamDTO;
import com.ironhack.pokemonservice.controller.dto.ResponseTeamDTO;
import com.ironhack.pokemonservice.controller.dto.TeamDTO;
import com.ironhack.pokemonservice.controller.dto.TrainerDTO;
import com.ironhack.pokemonservice.model.Team;
import com.ironhack.pokemonservice.model.Trainer;

import java.util.List;

public interface TeamService {
    List<TeamDTO> getAllTeams();
    ResponseTeamDTO getTeamByTrainerId(Long id);
    ResponseTeamDTO getTeamByTrainerName(String name);
    void addNewTeam(RequestTeamDTO requestTeamDTO);

    void deleteTeamByTrainerId(Long id);
}

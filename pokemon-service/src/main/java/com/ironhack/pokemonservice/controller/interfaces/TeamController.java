package com.ironhack.pokemonservice.controller.interfaces;

import com.ironhack.pokemonservice.controller.dto.RequestTeamDTO;
import com.ironhack.pokemonservice.controller.dto.ResponseTeamDTO;
import com.ironhack.pokemonservice.controller.dto.TeamDTO;
import com.ironhack.pokemonservice.model.Team;

import java.util.List;

public interface TeamController {
    List<TeamDTO> getAllTeams();
    ResponseTeamDTO getTeamByTrainerName(String name);
    ResponseTeamDTO getTeamByTrainerId(Long id);
    void addNewTeam(RequestTeamDTO requestTeamDTO);
    // ¿¿Borrar por equipo o por pokemon??
    // Borrar por equipo entero (por trainerID)
    // Borrar por pokemon necesito equipo y pokemon

    void deleteTeamByTrainerId(Long id);
}

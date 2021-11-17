package com.ironhack.pokemonservice.controller.impl;

import com.ironhack.pokemonservice.controller.dto.RequestTeamDTO;
import com.ironhack.pokemonservice.controller.dto.ResponseTeamDTO;
import com.ironhack.pokemonservice.controller.dto.TeamDTO;
import com.ironhack.pokemonservice.controller.interfaces.TeamController;
import com.ironhack.pokemonservice.model.Team;
import com.ironhack.pokemonservice.service.interfaces.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeamControllerImpl implements TeamController {

    @Autowired
    private TeamService teamService;

    @GetMapping("/pokemon/teams-all")
    @ResponseStatus(HttpStatus.OK)
    public List<TeamDTO> getAllTeams() {
        return teamService.getAllTeams();
    }

    @GetMapping("/pokemon/teams")
    @ResponseStatus(HttpStatus.OK)
    public ResponseTeamDTO getTeamByTrainerName(@RequestParam(name = "name") String name) {
        return teamService.getTeamByTrainerName(name);
    }

    @GetMapping("/pokemon/teams/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseTeamDTO getTeamByTrainerId(@PathVariable Long id) {
        return teamService.getTeamByTrainerId(id);
    }

    @PostMapping("/pokemon/teams")
    @ResponseStatus(HttpStatus.CREATED)
    public void addNewTeam(@RequestBody RequestTeamDTO requestTeamDTO) {
        teamService.addNewTeam(requestTeamDTO);
    }

    @DeleteMapping("/pokemon/teams/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTeamByTrainerId(@PathVariable Long id) {
        teamService.deleteTeamByTrainerId(id);
    }
}

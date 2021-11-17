package com.ironhack.pokemonservice.controller.impl;

import com.ironhack.pokemonservice.controller.dto.TeamMemberDTO;
import com.ironhack.pokemonservice.controller.interfaces.TeamMemberController;
import com.ironhack.pokemonservice.model.TeamMember;
import com.ironhack.pokemonservice.service.interfaces.TeamMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeamMemberControllerImpl implements TeamMemberController {

    @Autowired
    private TeamMemberService teamMemberService;


    @GetMapping("/pokemon/team-members-all")
    @ResponseStatus(HttpStatus.OK)
    public List<TeamMemberDTO> getAllTeamMembers() {
        return teamMemberService.getAllTeamMembers();
    }

    @GetMapping("/pokemon/team-members")
    @ResponseStatus(HttpStatus.OK)
    public TeamMemberDTO getTeamMemberByName(@RequestParam(name = "name") String name) {
        return teamMemberService.getTeamMemberByName(name);
    }

    @GetMapping("/pokemon/team-members/{id}")
    @ResponseStatus(HttpStatus.OK)
    public TeamMemberDTO getTeamMemberById(@PathVariable Long id) {
        return teamMemberService.getTeamMemberById(id);
    }

    @PostMapping("/pokemon/team-members")
    @ResponseStatus(HttpStatus.CREATED)
    public void addNewTeamMember(@RequestBody TeamMemberDTO teamMemberDTO) {
        teamMemberService.addNewTeamMember(teamMemberDTO);
    }

    @DeleteMapping("/pokemon/team-members/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTeamMember(@PathVariable Long id) {
        teamMemberService.deleteTeamMember(id);


    }


}

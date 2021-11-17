package com.ironhack.pokemonservice.service.interfaces;

import com.ironhack.pokemonservice.controller.dto.TeamDTO;
import com.ironhack.pokemonservice.controller.dto.TeamMemberDTO;
import com.ironhack.pokemonservice.model.Team;
import com.ironhack.pokemonservice.model.TeamMember;

import java.util.List;

public interface TeamMemberService {
    List<TeamMemberDTO> getAllTeamMembers();
    TeamMemberDTO getTeamMemberByName(String name);
    TeamMemberDTO getTeamMemberById(Long id);
    void addNewTeamMember(TeamMemberDTO teamMemberDTO);

    void deleteTeamMember(Long id);
}

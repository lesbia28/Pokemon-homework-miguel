package com.ironhack.pokemonservice.controller.interfaces;

import com.ironhack.pokemonservice.controller.dto.TeamMemberDTO;

import java.util.List;

public interface TeamMemberController {
    List<TeamMemberDTO> getAllTeamMembers();
    TeamMemberDTO getTeamMemberByName(String name);
    TeamMemberDTO getTeamMemberById(Long id);
    void addNewTeamMember(TeamMemberDTO teamMemberDTO);
    void deleteTeamMember(Long id);
}

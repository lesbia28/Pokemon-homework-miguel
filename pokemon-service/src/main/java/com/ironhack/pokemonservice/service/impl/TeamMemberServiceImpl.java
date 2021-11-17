package com.ironhack.pokemonservice.service.impl;

import com.ironhack.pokemonservice.controller.dto.TeamMemberDTO;
import com.ironhack.pokemonservice.model.TeamMember;
import com.ironhack.pokemonservice.model.Trainer;
import com.ironhack.pokemonservice.repository.TeamMemberRepository;
import com.ironhack.pokemonservice.service.interfaces.TeamMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TeamMemberServiceImpl implements TeamMemberService {

    @Autowired
    private TeamMemberRepository teamMemberRepository;


    public List<TeamMemberDTO> getAllTeamMembers() {
        List<TeamMemberDTO> teamMemberDTOS= new ArrayList<>();
        List<TeamMember> teamMembers=teamMemberRepository.findAll();
        for (TeamMember i:teamMembers) {
            teamMemberDTOS.add(new TeamMemberDTO(i.getId(),i.getName()));
        }
        return teamMemberDTOS;
    }

    public TeamMemberDTO getTeamMemberByName(String name) {
        TeamMember teamMember=teamMemberRepository.findByName(name)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "TeamMember Not found"));

        return (new TeamMemberDTO(teamMember.getId(), teamMember.getName()));
    }

    public TeamMemberDTO getTeamMemberById(Long id) {
        TeamMember teamMember=teamMemberRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "TeamMember Not found"));

        return (new TeamMemberDTO(teamMember.getId(), teamMember.getName()));

    }

    public void addNewTeamMember(TeamMemberDTO teamMemberDTO) {
        if (teamMemberDTO.getId() != null){
            Optional<TeamMember> optionalTeamMember = teamMemberRepository.findById(teamMemberDTO.getId());
            if (optionalTeamMember.isPresent())
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "A teamMember with code " + teamMemberDTO.getId() + " already exists");
        }

        TeamMember teamMember = new TeamMember();
        teamMember.setId(teamMemberDTO.getId());
        teamMember.setName(teamMemberDTO.getName());

        teamMemberRepository.save(teamMember);
    }

    @Override
    public void deleteTeamMember(Long id) {
        Optional<TeamMember> optionalTeamMember = teamMemberRepository.findById(id);
        if(optionalTeamMember.isPresent()){
            teamMemberRepository.deleteById(id);
        }
        else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No TeamMember found with id "+id);
        }
    }
}

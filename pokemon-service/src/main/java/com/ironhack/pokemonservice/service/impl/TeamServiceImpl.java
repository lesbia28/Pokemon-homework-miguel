package com.ironhack.pokemonservice.service.impl;

import com.ironhack.pokemonservice.controller.dto.RequestTeamDTO;
import com.ironhack.pokemonservice.controller.dto.ResponseTeamDTO;
import com.ironhack.pokemonservice.controller.dto.TeamDTO;
import com.ironhack.pokemonservice.controller.dto.TeamMemberDTO;
import com.ironhack.pokemonservice.model.Team;
import com.ironhack.pokemonservice.model.TeamMember;
import com.ironhack.pokemonservice.model.Trainer;
import com.ironhack.pokemonservice.repository.TeamMemberRepository;
import com.ironhack.pokemonservice.repository.TeamRepository;
import com.ironhack.pokemonservice.repository.TrainerRepository;
import com.ironhack.pokemonservice.service.interfaces.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private TrainerRepository trainerRepository;

    @Autowired
    private TeamMemberRepository teamMemberRepository;

    @Override
    public List<TeamDTO> getAllTeams() {
        List<Object[]> teamObjectList = teamRepository.getTeams();
        List<TeamDTO> teamDTOList = new ArrayList<>();

        for (Object[] objects : teamObjectList) {
            TeamDTO teamDTO = new TeamDTO();
            teamDTO.setTrainerName(String.valueOf(objects[0]));
            teamDTO.setTeamName(String.valueOf(objects[1]));
            teamDTOList.add(teamDTO);
        }
        return teamDTOList;
    }

    @Override
    public ResponseTeamDTO getTeamByTrainerId(Long id) {
        List<Object[]> teamObjectList = teamRepository.getTeamByTrainerId(id);
        List<TeamMemberDTO> teamMemberDTOList = new ArrayList<>();

        for (Object[] objects : teamObjectList) {
            TeamMemberDTO teamMemberDTO = new TeamMemberDTO();
            teamMemberDTO.setId(Long.parseLong(String.valueOf(objects[2])));
            teamMemberDTO.setName(String.valueOf(objects[3]));
//            teamMemberDTO.setType(String.valueOf(objects[4]));
            teamMemberDTOList.add(teamMemberDTO);
        }

        ResponseTeamDTO responseTeamDTO = new ResponseTeamDTO();
        responseTeamDTO.setTrainerName(String.valueOf(teamObjectList.get(0)[0]));
        responseTeamDTO.setTeamName(String.valueOf(teamObjectList.get(0)[1]));
        responseTeamDTO.setTeamMemberDTOList(teamMemberDTOList);
        return responseTeamDTO;
    }

    @Override
    public ResponseTeamDTO getTeamByTrainerName(String name) {
        List<Object[]> teamObjectList = teamRepository.getTeamByTrainerName(name);
        List<TeamMemberDTO> teamMemberDTOList = new ArrayList<>();

        for (Object[] objects : teamObjectList) {
            TeamMemberDTO teamMemberDTO = new TeamMemberDTO();
            teamMemberDTO.setId(Long.parseLong(String.valueOf(objects[2])));
            teamMemberDTO.setName(String.valueOf(objects[3]));
//            teamMemberDTO.setType(String.valueOf(objects[4]));
            teamMemberDTOList.add(teamMemberDTO);
        }

        ResponseTeamDTO responseTeamDTO = new ResponseTeamDTO();
        responseTeamDTO.setTrainerName(name);
        responseTeamDTO.setTeamName(String.valueOf(teamObjectList.get(0)[1]));
        responseTeamDTO.setTeamMemberDTOList(teamMemberDTOList);
        return responseTeamDTO;
    }

    public void addNewTeam(RequestTeamDTO requestTeamDTO) {
        Team team = new Team();
        team.setName(requestTeamDTO.getTeamName());

        // El trainer tiene que existir
        Optional<Trainer> optionalTrainer=trainerRepository.findById(requestTeamDTO.getTrainerId());
        if(optionalTrainer.isEmpty()){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "A trainer with id " + requestTeamDTO.getTrainerId() + " not exists");
        }
        team.setTrainer(optionalTrainer.get());

        // COMPROBAR NO MAS DE 6

        // I DON'T KNOW IF IT IS NECCESARY
        // IF EXISTS IN TEAMMEMBER DATABASE
        Optional<TeamMember> optionalTeamMember=teamMemberRepository.findById(requestTeamDTO.getTeamMemberId());
        if(optionalTeamMember.isEmpty()){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "A teamMember with id " + requestTeamDTO.getTeamMemberId()
                    + " not exists");
        }
        team.setTeamMember(optionalTeamMember.get());


        teamRepository.save(team);
    }

    @Override
    public void deleteTeamByTrainerId(Long id) {
        Optional<Trainer> optionalTrainer = trainerRepository.findById(id);
        if(optionalTrainer.isPresent()){
            List<Team> teamList=teamRepository.findByTrainer(optionalTrainer.get());
            for (Team i:teamList) {
                teamRepository.deleteById(i.getId());
            }
        }
        else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No Trainer found with id "+id);
        }
    }
}

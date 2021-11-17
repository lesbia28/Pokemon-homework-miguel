package com.ironhack.pokemonservice.controller.dto;

import java.util.List;

public class ResponseTeamDTO {

    private String trainerName;
    private String teamName;
    private List<TeamMemberDTO> teamMemberDTOList;

    public ResponseTeamDTO() {
    }

    public ResponseTeamDTO( String trainerName, String teamName, List<TeamMemberDTO> teamMemberDTOList) {
        this.trainerName = trainerName;
        this.teamName = teamName;
        this.teamMemberDTOList = teamMemberDTOList;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public List<TeamMemberDTO> getTeamMemberDTOList() {
        return teamMemberDTOList;
    }

    public void setTeamMemberDTOList(List<TeamMemberDTO> teamMemberDTOList) {
        this.teamMemberDTOList = teamMemberDTOList;
    }
}

package com.ironhack.pokemonservice.controller.dto;

public class RequestTeamDTO {
    private String teamName;
    private Long trainerId;
    private Long teamMemberId;

    public RequestTeamDTO() {
    }

    public RequestTeamDTO(String teamName, Long trainerId, Long teamMemberId) {
        this.teamName = teamName;
        this.trainerId = trainerId;
        this.teamMemberId = teamMemberId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Long getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(Long trainerId) {
        this.trainerId = trainerId;
    }

    public Long getTeamMemberId() {
        return teamMemberId;
    }

    public void setTeamMemberId(Long teamMemberId) {
        this.teamMemberId = teamMemberId;
    }
}

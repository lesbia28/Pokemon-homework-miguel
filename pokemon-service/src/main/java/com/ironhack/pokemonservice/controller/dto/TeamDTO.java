package com.ironhack.pokemonservice.controller.dto;

public class TeamDTO {
    private String trainerName;
    private String teamName;

    public TeamDTO() {
    }

    public TeamDTO(String trainerName, String teamName) {
        this.trainerName = trainerName;
        this.teamName = teamName;
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
}

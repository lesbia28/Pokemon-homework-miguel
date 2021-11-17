package com.ironhack.pokemonservice.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "team_members")
public class TeamMember {

    @Id
    private Long id;
    private String name;

    @OneToMany(mappedBy = "teamMember")
    @JsonBackReference
    private List<Team> teamList;

    // Constructors
    public TeamMember() {
    }

    public TeamMember(Long id, String name, List<Team> teamList) {
        this.id = id;
        this.name = name;
        this.teamList = teamList;
    }

    // Getters & setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Team> getTeamList() {
        return teamList;
    }

    public void setTeamList(List<Team> teamList) {
        this.teamList = teamList;
    }
}

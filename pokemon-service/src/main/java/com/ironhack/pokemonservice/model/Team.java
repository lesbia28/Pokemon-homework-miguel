package com.ironhack.pokemonservice.model;

import javax.persistence.*;


@Entity
@Table(name = "teams")
public class Team {

    private static final String DEFAULT_NAME = "UNNAMED";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "trainer_id")
    private Trainer trainer;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "team_member_id")
    private TeamMember teamMember;

    // Constructors
    public Team() {
    }

    public Team(Trainer trainer, TeamMember teamMember) {
        this.name = DEFAULT_NAME;
        this.trainer = trainer;
        this.teamMember = teamMember;
    }

    public Team(String name, Trainer trainer, TeamMember teamMember) {
        this.name = name;
        this.trainer = trainer;
        this.teamMember = teamMember;
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

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public TeamMember getTeamMember() {
        return teamMember;
    }

    public void setTeamMember(TeamMember teamMember) {
        this.teamMember = teamMember;
    }
}

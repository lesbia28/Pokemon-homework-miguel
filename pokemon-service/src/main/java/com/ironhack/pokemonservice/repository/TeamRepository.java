package com.ironhack.pokemonservice.repository;

import com.ironhack.pokemonservice.model.Team;
import com.ironhack.pokemonservice.model.TeamMember;
import com.ironhack.pokemonservice.model.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TeamRepository extends JpaRepository<Team, Long> {

    List<Team> findByTrainer(Trainer trainer);
    List<Team> findByTeamMember(TeamMember teamMember);
    List<Team> findByTrainerAndTeamMember(Trainer trainer, TeamMember teamMember);

    // count team members by trainer id
    @Query("SELECT COUNT(teamMember) FROM Team t JOIN t.trainer o WHERE o.id=:trainer_id")
    Integer countMembersByTrainer(@Param("trainer_id") Long trainerId);

    // get distinct teams
    @Query("SELECT DISTINCT o.name, t.name FROM Team t JOIN t.trainer o")
    List<Object[]> getTeams();

    // get team by trainer name
    @Query("SELECT DISTINCT o.name, t.name, m.id, m.name " +
            "FROM Team t " +
            "JOIN t.trainer o " +
            "JOIN t.teamMember m " +
            "WHERE o.name=:trainer_name")
    List<Object[]> getTeamByTrainerName(@Param("trainer_name") String trainerName);

    // get team by trainer id
    @Query("SELECT DISTINCT o.name, t.name, m.id, m.name " +
            "FROM Team t " +
            "JOIN t.trainer o " +
            "JOIN t.teamMember m " +
            "WHERE o.id=:trainer_id")
    List<Object[]> getTeamByTrainerId(@Param("trainer_id") Long trainerId);


}

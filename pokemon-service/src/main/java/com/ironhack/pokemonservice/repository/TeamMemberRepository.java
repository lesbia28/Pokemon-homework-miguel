package com.ironhack.pokemonservice.repository;

import com.ironhack.pokemonservice.model.TeamMember;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TeamMemberRepository extends JpaRepository<TeamMember, Long> {
    Optional<TeamMember> findByName(String name);
//    List<TeamMember> findByType(String name);
}

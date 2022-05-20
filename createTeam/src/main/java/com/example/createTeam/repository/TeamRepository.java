package com.example.createTeam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.createTeam.entity.Team;

public interface TeamRepository extends JpaRepository<Team, String> {

	public Team findByTeamName(String teamName);
	
}

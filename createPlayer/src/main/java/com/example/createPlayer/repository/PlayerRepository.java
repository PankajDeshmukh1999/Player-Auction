package com.example.createPlayer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.createPlayer.entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {

	public Player findByPlayerId(Long playerId);

	public Player findPlayerByTeamName(String teamName);
	
//	public List<Player> findListByPlayerId(Long playerId);
	public List<Player> findListByTeamName(String teamName);

}

package com.example.createPlayer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.createPlayer.dao.ResponseTemplateVO;
import com.example.createPlayer.dao.Team;
import com.example.createPlayer.entity.Player;
import com.example.createPlayer.repository.PlayerRepository;

@Service
public class PlayerService {

	@Autowired
	private PlayerRepository repository;

	@Autowired
	RestTemplate restTemplate;

	public Player savaData(Player player) {
		return repository.save(player);
	}

	public ResponseTemplateVO getTeamByPlayerById(Long playerId) {
		ResponseTemplateVO vo = new ResponseTemplateVO();
		Player player = repository.findByPlayerId(playerId);

		Team team = restTemplate.getForObject("http://localhost:8282/team/" + player.getTeamName(), Team.class);
		vo.setPlayer(player);
		vo.setTeam(team);
		return vo;
	}
	
	public Player findPlayerById(Long playerId) {
		return repository.findByPlayerId(playerId);
	}
	
	
	public List<Player> getAllData() {
		return (List<Player>) repository.findAll();
	}
	
	public List<Player> getPlayerById(String teamName){
		return repository.findListByTeamName(teamName);
	}
	
	
	
}

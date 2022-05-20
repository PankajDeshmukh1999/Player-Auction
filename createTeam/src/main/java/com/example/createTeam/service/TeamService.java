package com.example.createTeam.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.createTeam.dao.Player;
import com.example.createTeam.dao.ResponseTemplateVO;
import com.example.createTeam.entity.Team;
import com.example.createTeam.repository.TeamRepository;

@Service
public class TeamService {
	
	@Autowired
	private TeamRepository repository;
	
	@Autowired
	RestTemplate restTemplate;
	
	public Team saveTeam(Team team) {
		return repository.save(team);
	}
	
	public List<Team> getAllTeam() {
		return (List<Team>) repository.findAll();
	}
	
	public Team FindTeamByName(String teamName) {
		return repository.findByTeamName(teamName);
	}
	
	 public ResponseTemplateVO getTeamWithPlayer(String teamName) {
		 
		 ResponseTemplateVO vo = new ResponseTemplateVO();
		 Team team = repository.findByTeamName(teamName);
		 
		 Player player = restTemplate.getForObject("http://localhost:8383/list/" + team.getTeamName(), Player.class);
		 
		 vo.setPlayer(player);
		 vo.setTeam(team);
				 
		 return vo;
	 }
	

}

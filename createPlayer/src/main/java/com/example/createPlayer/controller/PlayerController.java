package com.example.createPlayer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.createPlayer.dao.ResponseTemplateVO;
import com.example.createPlayer.entity.Player;
import com.example.createPlayer.service.PlayerService;

@RestController
@CrossOrigin(origins = "*")
public class PlayerController {

	@Autowired
	private PlayerService service;
	
	@PostMapping("/saveData")
	public Player savaData(@RequestBody Player player) {
		return service.savaData(player);
	}
	
	//player by team id
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/byid/{playerId}")
	public ResponseTemplateVO getTeamByPlayerById(@PathVariable("playerId") Long playerId) {
		return service.getTeamByPlayerById(playerId);
	}
	

	
	@GetMapping("/getAllData")
	public ResponseEntity<List<Player>> getAllData() {
		return ResponseEntity.ok(service.getAllData());
	}

	
	@GetMapping("/{playerId}")
	public Player findPlayerById(@PathVariable("playerId") Long playerId) {
		return service.findPlayerById(playerId);
	}
	
	
	@GetMapping("/list/{teamName}")
	public ResponseEntity<List<Player>> getPlayerById(@PathVariable("teamName") String teamName){
		return ResponseEntity.ok(service.getPlayerById(teamName));
	}
	
	 
	
}

package com.example.createTeam.dao;

import java.util.List;

import com.example.createTeam.entity.Team;

public class ResponseTemplateVO {
	
	private Player player;
	private Team team;
	
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	public ResponseTemplateVO(Player player, Team team) {
		super();
		this.player = player;
		this.team = team;
	}
	
	public ResponseTemplateVO() {
		
	}
	
}

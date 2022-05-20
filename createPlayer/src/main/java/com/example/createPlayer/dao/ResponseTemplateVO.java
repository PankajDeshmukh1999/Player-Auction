package com.example.createPlayer.dao;

import com.example.createPlayer.entity.Player;

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

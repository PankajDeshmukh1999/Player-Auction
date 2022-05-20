package com.example.createPlayer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import net.bytebuddy.implementation.bind.annotation.Empty;

@Entity
public class Player {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long playerId;
	private String name;
	private int budgetPrice;
	private String teamName;
	
	public Long getPlayerId() {
		return playerId;
	}
	public void setPlayerId(Long playerId) {
		this.playerId = playerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBudgetPrice() {
		return budgetPrice;
	}
	public void setBudgetPrice(int budgetPrice) {
		this.budgetPrice = budgetPrice;
	}
	
	
	public Player(Long playerId, String name, int budgetPrice, String teamName) {
		super();
		this.playerId = playerId;
		this.name = name;
		this.budgetPrice = budgetPrice;
		this.teamName = teamName;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public Player() {
		
	}

}

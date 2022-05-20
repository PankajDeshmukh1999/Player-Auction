package com.example.createTeam.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;



@Entity
public class Team {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long teamId;

	private String teamName;
	private int maxBudget;

	public Long getTeamId() {
		return teamId;
	}

	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getMaxBudget() {
		return maxBudget;
	}

	public void setMaxBudget(int maxBudget) {
		this.maxBudget = maxBudget;
	}

	public Team(Long teamId, String teamName, int maxBudget) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.maxBudget = maxBudget;
	}

	public Team() {

	}

}

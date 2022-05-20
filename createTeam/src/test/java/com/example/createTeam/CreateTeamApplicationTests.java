package com.example.createTeam;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

import com.example.createTeam.entity.Team;
import com.example.createTeam.repository.TeamRepository;

@SpringBootTest
class CreateTeamApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
	private TeamRepository repository;
	
//	@Test
//	public void readAllTest() {
//		List list = repository.findAll();
//		assertThat(list).size().isGreaterThan(0);
//	}
	
//	@Test
//	public void TestRead() {
//		Team team = repository.findByTeamName("mi");
//		assertEquals("mi",team.getTeamName());
//	}

}

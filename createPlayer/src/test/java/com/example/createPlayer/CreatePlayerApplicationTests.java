package com.example.createPlayer;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.createPlayer.entity.Player;
import com.example.createPlayer.repository.PlayerRepository;
import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class CreatePlayerApplicationTests {

	@Test
	void contextLoads() {
	}
	
//	@Autowired
//	private PlayerRepository  repository;

//	@Test
//	public void testReadAll () {
//		List list = repository.findAll();
//		assertThat(list).size().isGreaterThan(0);
//	}
	
//	@Test
//	public void saveDataTest() {
//		Player p = new Player();
//		p.setPlayerId(6L);
//		p.setName("Kl rahul");
//		p.setBudgetPrice(7000);
//		p.setTeamName("mi");
//		repository.save(p);
//		assertNotNull(repository.findById(6L).get());
//		
//	}
	
//	@Test
//	public void findByIdTest() {
//		Player p = repository.findById(1l).get();
//		assertEquals("Dhoni", p.getName());
//	}
	
}

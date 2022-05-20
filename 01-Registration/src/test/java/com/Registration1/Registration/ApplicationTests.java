package com.Registration1.Registration;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.Registration.entity.User;
import com.Registration.repository.UserRepository;

@SpringBootTest
class ApplicationTests {

//	@Test
//	void contextLoads() {
//	}
	
	@Autowired
	private UserRepository repository;
	
//	@Test
//	public void savaDataTest() {
//		User u = new User();
//		u.setId(100L);
//		u.setUserName("Mahesh");
//		u.setAge(23);
//		u.setGender("Male");
//		u.setHobbis("playing,Swimming");
//		u.setPassword("Mahesh@123");
//		assertNotNull(repository.findById(100L).get());
//	}
	
//	@SuppressWarnings("unchecked")
//	@Test
//	public void readAllTest() {
//		List list = repository.findAll();
//		assertThat(list).size().isGreaterThan(0);
//	}
	
//	@Test
//	public void testByName () {
//		User user = repository.findByUserName("Pankaj");
//		assertEquals("Pankaj", user.getUserName());
//	}

}

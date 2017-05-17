package com.pp.voting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pp.voting.entities.Poll;
import com.pp.voting.entities.User;
import com.pp.voting.repositories.PollRepository;

@SpringBootApplication
public class VotingwebappApplication implements CommandLineRunner {
	
	@Autowired
	PollRepository pollRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(VotingwebappApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		pollRepository.deleteAll();
		
		User user1 = new User("programmingGuy", "Admin", "programmingGuy@gmail.com");
		User user2 = new User("programmingGirl", "User", "programmingGirl@gmail.com");
		
		List<User> list1 = new ArrayList<User>();
		list1.add(user1);
		
		List<User> list2 = new ArrayList<User>();
		list2.add(user2);
		
		List<User> list3 = new ArrayList<User>();
		list3.add(user1);
		list3.add(user2);
		
		List<User> emptyList = new ArrayList<User>();
		
		Map<String, List<User>> options1 = new HashMap<String, List<User>>();
		options1.put("Restaurant", list1);
		options1.put("Bar", emptyList);
		options1.put("Disco", list2);
		Poll poll1 = new Poll("Ricardo", "Go Paryt","Where you guys want to go?", options1);
		
		
		Map<String, List<User>> options2 = new HashMap<String, List<User>>();
		options2.put("Restaurant", list3);
		options2.put("Home", list1);
		Poll poll2 = new Poll("Manuel", "Dinner", "Where you guys want to dinner?", options2);
		
		pollRepository.save(poll1);
		pollRepository.save(poll2);
		
		//System.out.println("Query result: " + pollRepository.findPollByOwnerName("Manuel"));
		//System.out.println("Query result: " + pollRepository.findPollByPollName("Where you guys want to go?"));
		
		
		
	}
}

package com.pp.voting;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pp.voting.entities.Poll;
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
		
		Map<String, Integer> options1 = new HashMap<String, Integer>();
		options1.put("Restaurant", 0);
		options1.put("Bar", 2);
		options1.put("Disco", 3);
		Poll poll1 = new Poll("Ricardo","Where you guys want to go?", options1);
		
		
		Map<String, Integer> options2 = new HashMap<String, Integer>();
		options2.put("Restaurant", 0);
		options2.put("Home", 2);
		Poll poll2 = new Poll("Manuel", "Where you guys want to dinner?", options2);
		
		pollRepository.save(poll1);
		pollRepository.save(poll2);
		
		System.out.println("Query result: " + pollRepository.findPollByOwnerName("Manuel"));
		System.out.println("Query result: " + pollRepository.findPollByPollName("Where you guys want to go?"));
		
		
		
	}
}

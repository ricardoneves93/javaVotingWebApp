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
		
		Map<String, Integer> options = new HashMap<String, Integer>();
		options.put("Restaurant", 0);
		options.put("Bar", 2);
		options.put("Disco", 3);
		Poll poll = new Poll("Ricardo", "Where you guys want to go?", options);
		
		pollRepository.save(poll);
		
	}
}

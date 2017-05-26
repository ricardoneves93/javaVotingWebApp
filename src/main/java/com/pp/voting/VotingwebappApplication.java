package com.pp.voting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pp.voting.repositories.PollOptionRepository;
import com.pp.voting.repositories.PollRepository;

@SpringBootApplication
public class VotingwebappApplication/* implements CommandLineRunner */{
	
	@Autowired
	PollRepository pollRepository;
	
	@Autowired
	PollOptionRepository pollOptionRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(VotingwebappApplication.class, args);
	}

	/*
	@Override
	public void run(String... arg0) throws Exception {
		
		pollRepository.deleteAll();
		pollOptionRepository.deleteAll();
		
		PollOption pollOption1 = new PollOption("Restaurant");
		PollOption pollOption2 = new PollOption("Bar");
		PollOption pollOption3 = new PollOption("Pool");
		PollOption pollOption4 = new PollOption("Restaurant");
		PollOption pollOption5 = new PollOption("Snack bar");
		
		
		List<String> options1 = new ArrayList<>();
		options1.add(pollOptionRepository.save(pollOption1).id);
		options1.add(pollOptionRepository.save(pollOption2).id);
		options1.add(pollOptionRepository.save(pollOption3).id);
		Poll poll1 = new Poll("Where you guys want to go?","Place to go", options1);
		
		
		List<String> options2 = new ArrayList<>();
		options2.add(pollOptionRepository.save(pollOption4).id);
		options2.add(pollOptionRepository.save(pollOption5).id);
		Poll poll2 = new Poll("Where you guys want to dinner?", "Dinner of tuesday", options2);
		
		pollRepository.save(poll1);
		pollRepository.save(poll2);
		
		System.out.println("Query result: " + pollRepository.findPollByPollName("Dinner of tuesday"));
	
	}
	
	*/
}

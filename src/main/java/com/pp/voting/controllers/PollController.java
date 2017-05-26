package com.pp.voting.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pp.voting.entities.Poll;
import com.pp.voting.entities.PollOption;
import com.pp.voting.entities.PollOutput;
import com.pp.voting.repositories.PollOptionRepository;
import com.pp.voting.repositories.PollRepository;

@RestController
public class PollController {
	
	@Autowired
	PollRepository pollRepository;
	
	@Autowired
	PollOptionRepository pollOptionRepository;
	
	@RequestMapping(value = "/polls/{pollId}", method = {RequestMethod.GET})
	public PollOutput getPollById(@PathVariable String pollId) {
		Poll poll = pollRepository.findOne(pollId);
		if(poll != null) {
			List<PollOption> pollOptions = new ArrayList<>();
			for(String pollOptionId: poll.options) {
				PollOption pollOption = pollOptionRepository.findOne(pollOptionId);
				pollOptions.add(pollOption);
			}
			return new PollOutput(poll.id, poll.pollQuestion, poll.pollName, pollOptions, poll.viewHash, poll.voteHash);
		}
		return null;
	}
}

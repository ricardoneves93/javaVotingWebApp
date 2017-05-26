package com.pp.voting.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pp.voting.entities.Poll;

public interface PollRepository extends MongoRepository<Poll, String> {
	public List<Poll> findPollByPollName(String pollName);
}

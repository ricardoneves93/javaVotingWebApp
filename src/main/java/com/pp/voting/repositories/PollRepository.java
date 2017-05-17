package com.pp.voting.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pp.voting.entities.Poll;

public interface PollRepository extends MongoRepository<Poll, String> {
	// find<EntityName>By<entityProperty>
	public List<Poll> findPollByOwnerName(String ownerName);
	public List<Poll> findPollByPollName(String pollName);
}

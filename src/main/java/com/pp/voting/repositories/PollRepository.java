package com.pp.voting.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pp.voting.entities.Poll;

public interface PollRepository extends MongoRepository<Poll, String>{

}

package com.pp.voting.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pp.voting.entities.PollOption;

public interface PollOptionRepository extends MongoRepository<PollOption, String> {

}

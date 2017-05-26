package com.pp.voting.entities;

import java.util.List;
import java.util.UUID;

import org.springframework.data.annotation.Id;

public class Poll {
	@Id
	public String id;
	public String pollQuestion;
	public String pollName;
	
	List<String> options;
	
	public String viewHash;
	public String voteHash;

	public Poll(String pollQuestion, String pollName, List<String> options) {
		this.pollQuestion = pollQuestion;
		this.pollName = pollName;
		this.options = options;
		
		this.viewHash = UUID.randomUUID().toString();
		this.voteHash = UUID.randomUUID().toString();
	}

	@Override
	public String toString() {
		return "Poll [id=" + id + ", pollQuestion=" + pollQuestion + ", pollName=" + pollName + ", options=" + options + "]";
	}

	
}

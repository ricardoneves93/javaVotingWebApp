package com.pp.voting.entities;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.data.annotation.Id;

public class Poll {
	@Id
	public String id;
	public String ownerName;
	public String pollName;
	public String pollQuestion;
	
	Map<String, List<User>> options;
	
	public String viewHash;
	
	public String voteHash;
	
	public String editHash;

	public Poll(String ownerName, String pollName, String pollQuestion, Map<String, List<User>> options) {
		this.ownerName = ownerName;
		this.pollName = pollName;
		this.pollQuestion = pollQuestion;
		this.options = options;
		this.viewHash = UUID.randomUUID().toString();
		this.voteHash = UUID.randomUUID().toString();
		this.editHash = UUID.randomUUID().toString();
	}

	@Override
	public String toString() {
		return "Poll [id=" + id + ", ownerName=" + ownerName + ", pollName=" + pollName + ", pollQuestion="
				+ pollQuestion + ", options=" + options + ", viewHash=" + viewHash + ", voteHash=" + voteHash
				+ ", editHash=" + editHash + "]";
	}
}

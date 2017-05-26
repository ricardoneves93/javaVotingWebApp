package com.pp.voting.entities;

import java.util.Map;

import org.springframework.data.annotation.Id;

public class Poll {
	@Id
	public String id;
	public String ownerName;
	public String pollName;
	
	Map<String, Integer> options;

	public Poll(String ownerName, String pollName, Map<String, Integer> options) {
		this.ownerName = ownerName;
		this.pollName = pollName;
		this.options = options;
	}

	@Override
	public String toString() {
		return "Poll [id=" + id + ", ownerName=" + ownerName + ", pollName=" + pollName + ", options=" + options + "]";
	}

	
}

package com.pp.voting.entities;

import java.util.List;

public class PollOutput {
	public String id;
	public String pollQuestion;
	public String pollName;
	
	public List<PollOption> options;
	
	public String viewHash;
	public String voteHash;
	
	
	public PollOutput(String id, String pollQuestion, String pollName, List<PollOption> options, String viewHash, String voteHash) {
		this.id = id;
		this.pollQuestion = pollQuestion;
		this.pollName = pollName;
		this.options = options;
		this.viewHash = viewHash;
		this.voteHash = voteHash;
	}
}

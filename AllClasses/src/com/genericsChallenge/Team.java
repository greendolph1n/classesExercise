package com.genericsChallenge;

public class Team {
	private String teamName;
	int score;
	Team nextTeam=null,prevTeam=null;

	public Team(String teamName,int score) {
		this.teamName = teamName;
		this.score=score;
	}

	public String getTeamName() {
		return this.teamName;
	}

	public int getScore() {
		return this.score;
	}
	public Team setNext(Team team) {
		this.nextTeam=team;
		return this.nextTeam;
		
	}
	public Team setPrevious(Team team) {
		this.prevTeam=team;
		return this.prevTeam;
	}
	public Team next() {
		return this.nextTeam;
	}
	public Team previous() {
		return this.prevTeam;
	}

}

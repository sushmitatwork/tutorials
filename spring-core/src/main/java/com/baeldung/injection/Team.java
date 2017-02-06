package com.baeldung.injection;

public class Team {
    int teamId;
    String teamName;
    int noOfPeople;
    int matchesWon;
    Person teamOwner;

    public Team(int teamId, String teamName, int noOfPeople, int matchesWon, Person teamOwner) {
        super();
        this.teamId = teamId;
        this.teamName = teamName;
        this.noOfPeople = noOfPeople;
        this.matchesWon = matchesWon;
        this.teamOwner = teamOwner;
    }

    public int getTeamId() {
        return teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getNoOfPeople() {
        return noOfPeople;
    }

    public int getMatchesWon() {
        return matchesWon;
    }

    public Person getTeamOwner() {
        return teamOwner;
    }

}

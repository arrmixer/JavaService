package com.sportsdemo.com.sports.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Match {

    private Integer matchId;
    private Integer leagueId;

//    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private String matchStartIso;

    private String status;
    private Stage stage;
    private Group group;
    private Stats stats;
    private Venue venue;
    private Team homeTeam;
    private Team awayTeam;

    @Id
    private String id;

    public Match() {
    }

    public String getId() {
        return id;
    }

    @JsonProperty("match_id")
    public Integer getMatchId() {
        return matchId;
    }

    public void setMatchId(Integer matchId) {
        this.matchId = matchId;
    }

    @JsonProperty("league_id")
    public Integer getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(Integer leagueId) {
        this.leagueId = leagueId;
    }

    @JsonProperty("match_start_iso")
    public String getMatchStartIso() {
        return matchStartIso;
    }

    public void setMatchStartIso(String matchStartIso) {
        this.matchStartIso = matchStartIso;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    @JsonProperty("home_team")
    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    @JsonProperty("away_team")
    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }
}

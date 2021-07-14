package com.sportsdemo.com.sports.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Stats {
    private Integer homeScore;

    private Integer awayScore;

    public Stats() {
    }

    @JsonProperty("home_score")
    public Integer getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(Integer homeScore) {
        this.homeScore = homeScore;
    }

    @JsonProperty("away_score")
    public Integer getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(Integer awayScore) {
        this.awayScore = awayScore;
    }
}

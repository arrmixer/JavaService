package com.sportsdemo.com.sports.demo.service;

import com.sportsdemo.com.sports.demo.model.Match;
import com.sportsdemo.com.sports.demo.model.MatchData;
import reactor.core.publisher.Mono;

public interface SportsService {
    public Mono<MatchData> getMatches(String seasonId);
}

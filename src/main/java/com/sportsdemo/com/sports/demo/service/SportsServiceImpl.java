package com.sportsdemo.com.sports.demo.service;

import com.sportsdemo.com.sports.demo.model.MatchData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class SportsServiceImpl implements SportsService{

    @Autowired
    WebClient webClient;


    @Override
    public Mono<MatchData> getMatches(String seasonId) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder.path("/soccer/matches")
                        .queryParam("season_id", seasonId)
                        .build())
                .retrieve()
                .bodyToMono(MatchData.class);
    }
}

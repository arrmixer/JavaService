package com.sportsdemo.com.sports.demo.controller;

import com.sportsdemo.com.sports.demo.model.Data;
import com.sportsdemo.com.sports.demo.model.MatchData;
import com.sportsdemo.com.sports.demo.service.SportsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(SportsController.SPORTS_V_1)
public class SportsController {
    public static final String SPORTS_V_1 = "/sports/v1/";
    private final SportsService sportsService;

    @Autowired
    public SportsController(SportsService sportsService) {
        this.sportsService = sportsService;
    }

    @GetMapping(path = "/soccer/matches", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<MatchData> getMatches(@RequestParam(value = "season_id") String seasonId) {
        return sportsService.getMatches(seasonId);
    }
}

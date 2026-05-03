package com.example.voting_app.controllers;

import com.example.voting_app.model.Poll;
import com.example.voting_app.service.PollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/polls")
public class PollController {

    @Autowired
    PollService pollService;

    @PostMapping
    public Poll createPolls(@RequestBody Poll poll) {
        return pollService.createPoll(poll);
    }
}

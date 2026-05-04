package com.example.voting_app.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Vote {

    private Long pollId;
    private int optionIndex;
}

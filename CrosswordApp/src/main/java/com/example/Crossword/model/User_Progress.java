package com.example.Crossword.model;


public record User_Progress(
    Integer user_id,
    Integer crossword_id,
    Integer completion_time,
    Boolean completed
) {
}

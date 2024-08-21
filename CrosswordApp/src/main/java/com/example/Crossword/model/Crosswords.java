package com.example.Crossword.model;
import java.time.LocalDateTime;

public record Crosswords(
    Integer crossword_id,
    LocalDateTime createdDate) {
    
}

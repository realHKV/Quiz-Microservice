package com.example.QuizService.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
public class QuizDto {
    String categoryName;
    Integer numQuestions;
    String title;
}
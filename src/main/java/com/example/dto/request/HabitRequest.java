package com.example.dto.request;

import lombok.Builder;

import java.time.LocalDate;

@Builder
public record HabitRequest(
        String name,
        String description,
        Integer goal,
        String frequency,
        LocalDate start_date,
        LocalDate end_date
) {
}

package com.example.kanbanspring.model;

import java.time.LocalDateTime;

public record Board(
    Integer id,
    String name,
    String desc,
    LocalDateTime createdAt,
    LocalDateTime updatedAt

) {
}

package com.example.kanbanspring.model;

import java.time.LocalDateTime;

public record Section(
    Integer id,
    Integer boardId,
    String name,
    String desc,
    Integer order,
    LocalDateTime createdAt,
    LocalDateTime updatedAt

) {
}

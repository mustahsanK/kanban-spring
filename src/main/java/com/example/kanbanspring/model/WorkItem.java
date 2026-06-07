package com.example.kanbanspring.model;

import java.time.LocalDateTime;

public record WorkItem(
    Integer id,
    Integer sectionId,
    Integer boardId,
    String name,
    String desc,
    Integer position,
    Priority priority,
    LocalDateTime createdAt,
    LocalDateTime updatedAt

) {
}

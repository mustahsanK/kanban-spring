package com.example.kanbanspring.model;

public record Card(
    Integer id,
    Integer priority,
    Integer status,
    String title,
    String description) {
};

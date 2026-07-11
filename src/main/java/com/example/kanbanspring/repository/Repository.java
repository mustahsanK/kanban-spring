package com.example.kanbanspring.repository;

import org.springframework.data.repository.ListCrudRepository;

import com.example.kanbanspring.model.Board;

public interface Repository extends ListCrudRepository<Board, Integer> {

}

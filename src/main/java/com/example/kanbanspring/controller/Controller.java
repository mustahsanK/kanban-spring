package com.example.kanbanspring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.kanbanspring.model.Board;
import com.example.kanbanspring.repository.Repository;

@RestController
@RequestMapping("/api/kanban")
public class Controller {

  private final Repository repository;

  public Controller(Repository repository) {
    this.repository = repository;
  }

  @GetMapping("/about")
  public String aboutKanban() {
    return "Kanban Board";
  }

  @GetMapping("/board")
  public List<Board> findAll() {
    return repository.findAll();
  }
}

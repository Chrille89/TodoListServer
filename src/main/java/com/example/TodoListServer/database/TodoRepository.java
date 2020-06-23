package com.example.TodoListServer.database;

import com.example.TodoListServer.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

public interface TodoRepository extends JpaRepository<Todo, Integer> {
}

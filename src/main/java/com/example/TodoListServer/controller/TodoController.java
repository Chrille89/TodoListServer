package com.example.TodoListServer.controller;

import com.example.TodoListServer.database.TodoRepository;
import com.example.TodoListServer.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;

    @CrossOrigin
    @RequestMapping(
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE,
            path = "/all"
    )
    public List<Todo> getAllTodos() {
        System.out.println("Get all todos.");
        return todoRepository.findAll();
    }

    @CrossOrigin
    @RequestMapping(
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE,
            path = "/new"
    )
    public Todo createTodo(@RequestBody Todo todo) {
        return todoRepository.save(todo);
    }

    @CrossOrigin
    @RequestMapping(
            method = RequestMethod.DELETE,
            path = "/{id}"
    )
    public void completeTodo(@PathVariable Integer id) {
        todoRepository.deleteById(id);
    }
}

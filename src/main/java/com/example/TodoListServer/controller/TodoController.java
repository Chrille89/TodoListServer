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

    @RequestMapping(
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE,
            path = "/all"
    )
    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
       /* List<Todo> todoList = new ArrayList<>();
        todoList.add(new Todo(1,"test1"));
        todoList.add(new Todo(2,"test2"));
        return todoList;*/
    }

    @RequestMapping(
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE,
            path = "/new"
    )
    public Todo createTodo(@RequestBody Todo todo) {
        return todoRepository.save(todo);
    }

    @RequestMapping(
            method = RequestMethod.DELETE,
            path = "/{id}"
    )
    public void completeTodo(@PathVariable Integer id) {
        todoRepository.deleteById(id);
    }
}

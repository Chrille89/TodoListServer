package com.example.TodoListServer.controller;

import com.example.TodoListServer.model.Todo;
import org.springframework.context.ApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {

    @RequestMapping(
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE,
            path = "/all"
    )
    public List<Todo> getAllTodos() {
        List<Todo> todoList = new ArrayList<>();
        todoList.add(new Todo(1,"test1"));
        todoList.add(new Todo(2,"test2"));
        return todoList;
    }

}

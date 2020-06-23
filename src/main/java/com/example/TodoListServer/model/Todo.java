package com.example.TodoListServer.model;

public class Todo {

    private int id;
    private String label;

    public Todo(int id, String label) {
        setId(id);
        setLabel(label);
    }

    public int getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setId(int id) {
        this.id = id;
    }
}

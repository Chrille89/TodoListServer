package com.example.TodoListServer.model;

import com.sun.istack.NotNull;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Entity
@Table
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private String label;

    public Todo() {
    }

    public Todo(@NotNull String label) {
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

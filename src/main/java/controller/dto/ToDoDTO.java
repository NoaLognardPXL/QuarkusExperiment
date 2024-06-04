package controller.dto;

import domain.ToDo;

public class ToDoDTO {
    private final Long id;
    private final boolean completed;

    private final String description;


    public ToDoDTO(ToDo todo){
        this.id = todo.getId();
        this.completed = todo.isCompleted();
        this.description = todo.getDescription();
    }

    public Long getId() {
        return id;
    }

    public boolean isCompleted() {
        return completed;
    }

    public String getDescription() {
        return description;
    }
}

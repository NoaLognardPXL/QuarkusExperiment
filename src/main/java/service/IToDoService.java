package service;

import controller.dto.ToDoDTO;
import controller.request.ToDoRequest;

import java.util.List;

public interface IToDoService {
    List<ToDoDTO> getAllToDoItems();

    Long createToDoItem(ToDoRequest toDoRequest);

    ToDoDTO updateToDoItem(Long toDoId, ToDoRequest toDoRequest);

    boolean deleteToDoItem(Long todoId);
}

package service.impl;

import controller.dto.ToDoDTO;
import controller.request.ToDoRequest;
import domain.ToDo;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import repository.IToDoRepository;
import service.IToDoService;

import java.util.List;

@ApplicationScoped
public class ToDoService implements IToDoService {

    private final IToDoRepository repository;

    public ToDoService(IToDoRepository repository){
        this.repository = repository;
    }
    @Override
    @Transactional
    public List<ToDoDTO> getAllToDoItems() {
        return repository.findAll().stream().map(ToDoDTO :: new).toList();
    }

    @Override
    @Transactional
    public Long createToDoItem(ToDoRequest toDoRequest) {
        ToDo toDo = new ToDo();
        toDo.setCompleted(toDoRequest.isCompleted());
        toDo.setDescription(toDoRequest.getDescription());
        repository.persist(toDo);
        return toDo.getId();
    }

    @Override
    @Transactional
    public ToDoDTO updateToDoItem(Long toDoId, ToDoRequest toDoRequest) {
        ToDo toDoToChange = repository.findById(toDoId);
        toDoToChange.setCompleted(toDoRequest.isCompleted());
        toDoToChange.setDescription(toDoRequest.getDescription());
        repository.persist(toDoToChange);
        return new ToDoDTO(toDoToChange);
    }

    @Override
    @Transactional
    public boolean deleteToDoItem(Long todoId) {
       repository.deleteById(todoId);
       return true;
    }
}

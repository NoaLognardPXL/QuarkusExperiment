package controller;

import controller.dto.ToDoDTO;
import controller.request.ToDoRequest;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import service.IToDoService;

import java.awt.*;
import java.util.List;

@Path("/ToDoItems")
public class ToDoController {

    private final IToDoService toDoService;

    public ToDoController(IToDoService service) {
        this.toDoService = service;
    }

    @GET
    public List<ToDoDTO> getAllToDoItems() {
        return this.toDoService.getAllToDoItems();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Long createToDoItem(ToDoRequest toDoRequest) {
        return toDoService.createToDoItem(toDoRequest);
    }

    @PUT
    @Path("{toDoId}")
    @Consumes(MediaType.APPLICATION_JSON)
    public ToDoDTO updateToDoItem(@PathParam("toDoId") Long id, ToDoRequest toDoRequest) {
        return this.toDoService.updateToDoItem(id, toDoRequest);
    }

    @DELETE
    @Path("{toDoId}")
    public boolean deleteToDoItem(@PathParam("toDoId") Long id) {
        return this.toDoService.deleteToDoItem(id);
    }
}

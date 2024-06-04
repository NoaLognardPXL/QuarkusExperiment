package controller.request;

public class ToDoRequest {
    private boolean completed;
    private String description;

    public ToDoRequest(boolean completed, String description) {
        this.completed = completed;
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

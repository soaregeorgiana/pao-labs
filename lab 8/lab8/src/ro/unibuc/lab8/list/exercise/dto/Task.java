package ro.unibuc.lab8.list.exercise.dto;

import java.util.Objects;

public class Task {

    private String id;
    private int priority;
    private boolean isInProgress;

    public Task(String id, int priority, boolean isInProgress) {
        this.id = id;
        this.priority = priority;
        this.isInProgress = isInProgress;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Task task = (Task) o;
        return getId().equals(task.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isInProgress);
    }

    @Override
    public String toString() {
        return "Task{" +
                "id='" + id + '\'' +
                ", priority=" + priority +
                ", isInProgress=" + isInProgress +
                '}';
    }
}

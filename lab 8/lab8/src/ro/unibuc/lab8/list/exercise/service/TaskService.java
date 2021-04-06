package ro.unibuc.lab8.list.exercise.service;

import ro.unibuc.lab8.list.exercise.dto.Task;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class TaskService {

    private LinkedList<Task> readyForDevelopmentTasks = new LinkedList<>();
    private List<Task> inProgressTasks = new ArrayList<>();

    //TODO: getTasksReadyForDev
    //TODO: displayInProgressTasks
    //TODO: displayReadyForDevelopmentTasks

    public TaskService() {
        this.init();
    }

    public void addTaskInProgress(Task task) {
        if (this.readyForDevelopmentTasks.contains(task)) {
            this.readyForDevelopmentTasks.remove(task);
            task.setInProgress(true);
            this.inProgressTasks.add(task);
        } else {
            throw new RuntimeException("This task wasn't planned for this sprint");
        }
    }

    public LinkedList<Task> getTasksReadyForReviewSortByPriority() {
        this.readyForDevelopmentTasks.sort(new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return o2.getPriority() - o1.getPriority();
            }
        });
        return this.readyForDevelopmentTasks;
    }

    public void displayInProgressTasks() {
        System.out.println("In progress");
        for (Task task : this.inProgressTasks) {
            System.out.println(task);
        }
    }

    public void displayReadyForDevelopmentTasks() {
        ListIterator<Task> iterator = this.readyForDevelopmentTasks.listIterator();
        System.out.println("Ready for development");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private void init() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            this.readyForDevelopmentTasks.add(new Task(String.valueOf(random.nextInt()), i + 1, false));
        }
    }
}

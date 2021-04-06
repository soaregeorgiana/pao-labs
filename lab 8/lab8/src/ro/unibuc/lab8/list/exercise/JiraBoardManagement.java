package ro.unibuc.lab8.list.exercise;

import ro.unibuc.lab8.list.exercise.dto.Task;
import ro.unibuc.lab8.list.exercise.service.TaskService;

import java.util.LinkedList;

public class JiraBoardManagement {

    /**
     * Create a program which handles tasks using List implementations:
     * - add task in progress (a task can be added in progress if it is contained by the ready for development list,
     * otherwise an exception will be thrown )
     * - the tasks must be added based on their priority
     * - get all Tasks in progress
     * - get all tasks ready for development
     */
    public static void main(String[] args) {

        TaskService service = new TaskService();
        LinkedList<Task> readyForDevelopTasks = service.getTasksReadyForReviewSortByPriority();
        service.addTaskInProgress(readyForDevelopTasks.getFirst());
        service.displayInProgressTasks();
        service.displayReadyForDevelopmentTasks();
    }
}

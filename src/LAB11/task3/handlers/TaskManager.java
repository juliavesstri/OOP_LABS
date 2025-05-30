package LAB11.task3.handlers;

import LAB11.task3.models.BaseTask;
import LAB11.task3.errors.TaskNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TaskManager {
    private List<BaseTask> tasks;
    private int taskCounter = 1;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public int generateTaskId() {
        return taskCounter++;
    }

    public void addTask(BaseTask task) {
        tasks.add(task);
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("✅ No tasks found.");
        } else {
            for (BaseTask task : tasks) {
                System.out.println(task);
            }
        }
    }

    public void deleteTask(int id) throws TaskNotFoundException {
        Optional<BaseTask> task = tasks.stream()
                .filter(t -> t.getId() == id)
                .findFirst();

        if (task.isPresent()) {
            tasks.remove(task.get());
            System.out.println("🗑 Task removed successfully.");
        } else {
            throw new TaskNotFoundException("Task with ID " + id + " not found.");
        }
    }

    public void markTaskAsDone(int id) throws TaskNotFoundException {
        Optional<BaseTask> task = tasks.stream()
                .filter(t -> t.getId() == id)
                .findFirst();

        if (task.isPresent()) {
            task.get().markAsDone();
            System.out.println("✅ Task marked as done.");
        } else {
            throw new TaskNotFoundException("Task with ID " + id + " not found.");
        }
    }
}



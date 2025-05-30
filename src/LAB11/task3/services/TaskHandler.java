package LAB11.task3.services;

import LAB11.task3.handlers.TaskManager;
import LAB11.task3.handlers.UserInputHandler;
import LAB11.task3.models.HighPriorityTask;
import LAB11.task3.models.RecurringTask;
import LAB11.task3.models.Task;
import LAB11.task3.errors.TaskNotFoundException;

public class TaskHandler {
    private final TaskManager taskManager;

    public TaskHandler(TaskManager taskManager) {
        this.taskManager = taskManager;
    }

    public void handleUserChoice(int choice) {
        try {
            switch (choice) {
                case 1 -> addTask();
                case 2 -> addRecurringTask();
                case 3 -> addHighPriorityTask();
                case 4 -> taskManager.listTasks();
                case 5 -> markTaskAsDone();
                case 6 -> deleteTask();
                default -> System.out.println("❌ Invalid choice. Try again.");
            }
        } catch (TaskNotFoundException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }

    private void addTask() {
        String title = UserInputHandler.getStringInput("Enter task title: ");
        taskManager.addTask(new Task(taskManager.generateTaskId(), title));
    }

    private void addRecurringTask() {
        String title = UserInputHandler.getStringInput("Enter recurring task title: ");
        String frequency = UserInputHandler.getStringInput("Enter repeat frequency: ");
        taskManager.addTask(new RecurringTask(taskManager.generateTaskId(), title, frequency));
    }

    private void addHighPriorityTask() {
        String title = UserInputHandler.getStringInput("Enter high priority task title: ");
        int priority = UserInputHandler.getIntInput("Enter priority level (1-5): ");
        taskManager.addTask(new HighPriorityTask(taskManager.generateTaskId(), title, priority));
    }

    private void markTaskAsDone() throws TaskNotFoundException {
        int taskId = UserInputHandler.getIntInput("Enter task ID to mark as done: ");
        taskManager.markTaskAsDone(taskId);
    }

    private void deleteTask() throws TaskNotFoundException {
        int taskId = UserInputHandler.getIntInput("Enter task ID to delete: ");
        taskManager.deleteTask(taskId);
    }
}

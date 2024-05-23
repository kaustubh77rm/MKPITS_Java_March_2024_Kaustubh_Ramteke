package assgn_14.linkedlist;
import java.util.*;

class Task {
    private String taskId;
    private String taskName;
    private int priority;
    private String dueDate;

    public Task(String taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
    }

    public String getTaskId() {
        return taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public int getPriority() {
        return priority;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId='" + taskId + '\'' +
                ", taskName='" + taskName + '\'' +
                ", priority=" + priority +
                ", dueDate='" + dueDate + '\'' +
                '}';
    }
}

class TaskManagementSystem {
    private LinkedList<Task> tasks;

    public TaskManagementSystem() {
        this.tasks = new LinkedList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
        System.out.println("Task added successfully.");
    }

    public void removeTaskById(String taskId) {
        Task taskToRemove = null;
        for (Task task : tasks) {
            if (task.getTaskId().equals(taskId)) {
                taskToRemove = task;
                break;
            }
        }
        if (taskToRemove != null) {
            tasks.remove(taskToRemove);
            System.out.println("Task removed successfully.");
        } else {
            System.out.println("Task not found.");
        }
    }

    public void searchTaskById(String taskId) {
        for (Task task : tasks) {
            if (task.getTaskId().equals(taskId)) {
                System.out.println(task);
                return;
            }
        }
        System.out.println("Task not found.");
    }

    public void displayTasksSortedByDueDate() {
        Collections.sort(tasks, Comparator.comparing(Task::getDueDate));
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public void displayAllTasks() {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }
}

public class TaskManager {
    public static void main(String[] args) {
        TaskManagementSystem taskManagementSystem = new TaskManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Task Management System:");
            System.out.println("1. Add a new task");
            System.out.println("2. Remove a task by taskId");
            System.out.println("3. Search for a task by taskId");
            System.out.println("4. Display all tasks sorted by due date");
            System.out.println("5. Display all tasks");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter taskId: ");
                    String taskId = scanner.nextLine();
                    System.out.print("Enter taskName: ");
                    String taskName = scanner.nextLine();
                    System.out.print("Enter priority: ");
                    int priority = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter due date (yyyy-mm-dd): ");
                    String dueDate = scanner.nextLine();
                    Task task = new Task(taskId, taskName, priority, dueDate);
                    taskManagementSystem.addTask(task);
                    break;
                case 2:
                    System.out.print("Enter taskId: ");
                    String removeTaskId = scanner.nextLine();
                    taskManagementSystem.removeTaskById(removeTaskId);
                    break;
                case 3:
                    System.out.print("Enter taskId: ");
                    String searchTaskId = scanner.nextLine();
                    taskManagementSystem.searchTaskById(searchTaskId);
                    break;
                case 4:
                    taskManagementSystem.displayTasksSortedByDueDate();
                    break;
                case 5:
                    taskManagementSystem.displayAllTasks();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
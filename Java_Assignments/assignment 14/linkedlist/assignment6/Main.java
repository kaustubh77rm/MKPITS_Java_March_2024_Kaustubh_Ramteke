package assgn_14.linkedlist.assignment6;

public class Main {
    public static void main(String[] args) {
        Task task1 = new Task("1", "Task 1", "High", "2023-05-29");
        Task task2 = new Task("2", "Task 2", "Medium", "2023-05-30");
        Task task3 = new Task("3", "Task 3", "Low", "2023-05-28");
        Task task4 = new Task("4", "Task 4", "High", "2023-05-31");

        TaskManagementSystem tms = new TaskManagementSystem();
        tms.addtask(task1);
        tms.addtask(task2);
        tms.addtask(task3);
        tms.addtask(task4);

        System.out.println("All tasks:");
        tms.display();

        System.out.println("\nSearching for task with id '2':");
        tms.searchById("2");

        System.out.println("\nRemoving task with id '3':");
        tms.removeById("3");

        System.out.println("\nAll tasks after removal:");
        tms.display();

        System.out.println("\nTasks sorted by due date:");
        tms.sort();
        tms.display();
    }
}

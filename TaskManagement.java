import java.util.ArrayList;
import java.util.Scanner;

public class TaskManagement{

    // Task class representing a task with a title and description
    static class Task {
        private String title;
        private String description;

        // Constructor for creating a new task
        public Task(String title, String description) {
            this.title = title;
            this.description = description;
        }

        // Getter and Setter methods for task title
        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        // Getter and Setter methods for task description
        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return "Task: " + title + " | Description: " + description;
        }
    }

    public static void main(String[] args) {
        ArrayList<Task> taskList = new ArrayList<>();  // List to hold tasks
        Scanner scanner = new Scanner(System.in);  // Scanner for user input
        boolean running = true;

        // Main loop for the CRUD task manager
        while (running) {
            System.out.println("\nTask Manager Menu:");
            System.out.println("1. Create a new task");
            System.out.println("2. View all tasks");
            System.out.println("3. Update a task");
            System.out.println("4. Delete a task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    // Create a new task
                    createTask(taskList, scanner);
                    break;

                case 2:
                    // View all tasks
                    viewTasks(taskList);
                    break;

                case 3:
                    // Update an existing task
                    updateTask(taskList, scanner);
                    break;

                case 4:
                    // Delete a task
                    deleteTask(taskList, scanner);
                    break;

                case 5:
                    // Exit the application
                    running = false;
                    System.out.println("Exiting Task Manager.");
                    break;

                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }

        scanner.close();
    }

    // Method to create a new task
    public static void createTask(ArrayList<Task> taskList, Scanner scanner) {
        System.out.print("Enter task title: ");
        String title = scanner.nextLine();
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();

        Task newTask = new Task(title, description);
        taskList.add(newTask);
        System.out.println("Task created successfully.");
    }

    // Method to display all tasks
    public static void viewTasks(ArrayList<Task> taskList) {
        if (taskList.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("List of tasks:");
            for (int i = 0; i < taskList.size(); i++) {
                System.out.println((i + 1) + ". " + taskList.get(i));
            }
        }
    }

    // Method to update an existing task
    public static void updateTask(ArrayList<Task> taskList, Scanner scanner) {
        if (taskList.isEmpty()) {
            System.out.println("No tasks available to update.");
            return;
        }

        viewTasks(taskList);
        System.out.print("Enter the task number to update: ");
        int taskNumber = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        if (taskNumber > 0 && taskNumber <= taskList.size()) {
            Task taskToUpdate = taskList.get(taskNumber - 1);
            System.out.print("Enter new title (leave blank to keep current): ");
            String newTitle = scanner.nextLine();
            if (!newTitle.isEmpty()) {
                taskToUpdate.setTitle(newTitle);
            }

            System.out.print("Enter new description (leave blank to keep current): ");
            String newDescription = scanner.nextLine();
            if (!newDescription.isEmpty()) {
                taskToUpdate.setDescription(newDescription);
            }

            System.out.println("Task updated successfully.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    // Method to delete a task
    public static void deleteTask(ArrayList<Task> taskList, Scanner scanner) {
        if (taskList.isEmpty()) {
            System.out.println("No tasks available to delete.");
            return;
        }

        viewTasks(taskList);
        System.out.print("Enter the task number to delete: ");
        int taskNumber = scanner.nextInt();

        if (taskNumber > 0 && taskNumber <= taskList.size()) {
            taskList.remove(taskNumber - 1);
            System.out.println("Task deleted successfully.");
        } else {
            System.out.println("Invalid task number.");
        }
    }
}

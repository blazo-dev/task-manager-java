import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskManager {
    // List to store tasks
    private static final List<Task> tasks = new ArrayList<>();

    // Scanner for user input
    private static final Scanner scanner = new Scanner(System.in);

    // Method to show the main menu
    public static void showMenu() {
        System.out.println("👋 Welcome to the To-Do Application!");
        System.out.println("1. ➕ Add Task");
        System.out.println("2. 📋 View Tasks");
        System.out.println("3. ❌ Delete Task");
        System.out.println("4. ✅ Mark as Completed");
        System.out.println("5. 🚪 Quit");
        System.out.print("\n🔢 Please select an option: ");
    }

    // Method to handle adding a task
    public static void addTask() {
        Task task = new Task();

        System.out.print("\n✍️ Enter the task's name to add: ");
        String taskName = scanner.nextLine();

        if (!Validations.isStringValid(taskName)) {
            System.out.println("❌ Invalid task name. Please enter a valid name.");
            return;
        }

        System.out.print("\n✍️ Enter the task's description to add: ");
        String taskDescription = scanner.nextLine();

        if (!Validations.isStringValid(taskDescription)) {
            System.out.println("❌ Invalid description. Please enter a valid description.");
            return;
        }


        task.name = taskName;
        task.description = taskDescription;
        task.isCompleted = false;

        tasks.add(task);
        System.out.println("\n✅ Task added successfully!\n");
    }

    // Method to handle viewing tasks
    public static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("\n😞 No tasks available.\n");
            return;
        }

        System.out.println("\n🎯 Your Tasks:\n");

        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            System.out.println(
                    "========================================\n" +
                            "Task #" + (i + 1) + "\n" +
                            "----------------------------------------\n" +
                            "Name        : " + task.name + "\n" +
                            "Description : " + task.description + "\n" +
                            "Status      : " + (task.isCompleted ? "Completed" : "Not Completed") + "\n" +
                            "========================================\n"
            );
        }

    }

    // Method to handle deleting a task
    public static void deleteTask() {
        if (tasks.isEmpty()) {
            System.out.println("\n😞 No tasks to delete.\n");
            return;
        }

        System.out.print("\n🔢 Enter the task number to delete: ");
        try {
            int taskNumber = Integer.parseInt(scanner.nextLine());  // Use scanner to read input
            if (taskNumber < 1 || taskNumber > tasks.size()) {
                System.out.println("\n❌ Invalid task number.\n");
            } else {
                tasks.remove(taskNumber - 1);
                System.out.println("\n✅ Task deleted!\n");
            }
        } catch (NumberFormatException e) {
            System.out.println("\n❌ Invalid input. Please enter a valid number.\n");
        }
    }

    public static void markAsCompleted() {
        if (tasks.isEmpty()) {
            System.out.println("\n😞 No tasks to complete.\n");
            return;
        }

        System.out.print("\n🔢 Enter the task number to complete: ");
        try {
            int taskNumber = Integer.parseInt(scanner.nextLine());  // Use scanner to read input
            if (taskNumber < 1 || taskNumber > tasks.size()) {
                System.out.println("\n❌ Invalid task number.\n");
            } else {
                tasks.get(taskNumber - 1).markAsCompleted();
                System.out.println("\n✅ Task completed!\n");
            }
        } catch (NumberFormatException e) {
            System.out.println("\n❌ Invalid input. Please enter a valid number.\n");
        }
    }

    // Method to handle user input and menu options
    public static void main(String[] args) {
        while (true) {
            showMenu();
            try {
                int choice = Integer.parseInt(scanner.nextLine());  // Use scanner to read input

                switch (choice) {
                    case 1:
                        addTask();
                        break;
                    case 2:
                        viewTasks();
                        break;
                    case 3:
                        deleteTask();
                        break;
                    case 4:
                        markAsCompleted();
                        break;
                    case 5:
                        System.out.println("\n👋 Exiting application.\n");
                        scanner.close();  // Close the scanner to avoid resource leak
                        return; // Ends the main method execution
                    default:
                        System.out.println("\n❌ Invalid option. Please try again.\n");
                }

            } catch (NumberFormatException e) {
                System.out.println("\n❌ Invalid input. Please enter a number between 1 and 4.\n");
            }
        }
    }
}

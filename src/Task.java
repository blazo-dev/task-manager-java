public class Task {
    public String name;
    public boolean isCompleted;
    public String description;


    public Task(String name, boolean isCompleted, String description) {
        this.name = name;
        this.isCompleted = isCompleted;
        this.description = description;
    }

    public Task() {
    }


    public String toString() {
        return String.format(
                "Task: %s\nDescription: %s\nStatus: %s\n",
                name,
                description,
                isCompleted ? "Completed" : "Not Completed"
        );
    }

    public void markAsCompleted() {
        isCompleted = true;
    }
}

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
        return "----------------------------------------\n" +
                "Name        : " + this.name + "\n" +
                "Description : " + this.description + "\n" +
                "Status      : " + (this.isCompleted ? "Completed" : "Not Completed") + "\n";

    }

    public void markAsCompleted() {
        isCompleted = true;
    }
}

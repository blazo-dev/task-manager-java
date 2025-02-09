# To-Do Application (Java)

## Overview
This is a simple Command Line Interface (CLI) To-Do List Application built using Java. The application allows users to add, view, and delete tasks. It includes input validation, error handling, and provides a clear user interface using emojis to make interactions more engaging.

## Features
- **Add Task**: Allows users to add a new task to the list.
- **View Tasks**: Displays the list of tasks added by the user.
- **Delete Task**: Enables users to delete a task by specifying its number.
- **Quit**: Exit the application.

## Requirements
- Java 8 or higher installed.

## How to Run
1. Clone the repository to your local machine:
    ```bash
    git clone git@github.com:blazo-dev/task-manager-java.git
    ```

2. Navigate to the project folder:
    ```bash
    cd task-manager-java
    ```

3. Compile and run the Java program:
    ```bash
    javac TaskManager.java
    java TaskManager
    ```

## Example Usage

```
👋 Welcome to the To-Do Application!
1. ➕ Add Task
2. 📋 View Tasks
3. ❌ Delete Task
4. ✅ Mark as Completed
5. 🚪 Quit

🔢 Please select an option: 1

✍️ Enter the task's name to add: Learn Java

✍️ Enter the task's description to add: Java Daba Duuuu

✅ Task added successfully!

👋 Welcome to the To-Do Application!
1. ➕ Add Task
2. 📋 View Tasks
3. ❌ Delete Task
4. ✅ Mark as Completed
5. 🚪 Quit

🔢 Please select an option: 2

🎯 Your Tasks:

========================================
Task #1
----------------------------------------
Name        : Learn Java
Description : Java Daba Duuuu
Status      : Not Completed
========================================

```

## Error Handling
The application includes basic error handling for invalid input and ensures:
- Invalid task numbers are not accepted when deleting tasks.
- Non-numeric input is properly handled.

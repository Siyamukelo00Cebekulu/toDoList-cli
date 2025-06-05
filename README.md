# 🗂️ Task Tracker CLI (Java)

A simple command-line interface (CLI) tool written in pure Java to help you manage your tasks. No external libraries or frameworks are used — only the Java Standard Library.

---

## 📦 Features

- ✅ Add, update, and delete tasks  
- ✅ Mark tasks as **in progress** or **done**  
- ✅ List all tasks or filter by status  
- ✅ Task data saved in a local `tasks.json` file  
- ✅ No external dependencies  

---

## 📁 Project Structure

├── Task.java // Task model
├── TaskManager.java // Core logic
├── TaskStorage.java // JSON file handler
├── TaskCLI.java // Command-line interface
└── TaskCLITest.java // Simple unit tests


---

## 🛠️ How to Compile

Make sure you have **Java 8 or higher** installed.


javac *.java

---


## ▶️ How to Run

java TaskCLI add "Buy groceries"

## Add a new task

```bash
java TaskCLI add "Buy groceries"

Output:
Task added successfully (ID: 1)
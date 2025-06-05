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

TODOLIST-CLI/

├── Task.java // Task model

├── TaskManager.java // Core logic

├── TaskStorage.java // JSON file handler

├── TaskCLI.java // Command-line interface

├── TaskCLITest.java // Simple unit tests


---

## 🛠️ How to Compile

Make sure you have **Java 8 or higher** installed.


javac *.java

---


## ▶️ How to Run

```bash
java TaskCLI add "Buy groceries"
```
---

## ➕ Add a new task

```bash
java TaskCLI add "Buy groceries"
```

---

## ✏️ Update an existing task

```bash
java TaskCLI update 1 "Buy groceries and cook dinner"
```

## ❌ Delete a task

```bash
java TaskCLI delete 1
```

## 📝 Mark a task as in-progress

```bash
java TaskCLI mark-in-progress 1
```

## 📝 Mark a task as done

```bash
java TaskCLI mark-done 1
```


## 📝 List all tasks

```bash
java TaskCLI list
```

## 📝 List tasks by status

```bash
java TaskCLI list todo
java TaskCLI list done
java TaskCLI list in-progress
```

## 🧪 Run Unit Tests

```bash
java TaskCLITest
```

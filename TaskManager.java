import java.time.LocalDateTime;
import java.util.*;

public class TaskManager {
    private final List<Task> tasks;

    public TaskManager(List<Task> tasks) {
        this.tasks = tasks;
    }

    public Task addTask(String description) {
        int nextId = tasks.stream().mapToInt(t -> t.id).max().orElse(0) + 1;
        String now = LocalDateTime.now().toString();
        Task task = new Task(nextId, description, "todo", now, now);
        tasks.add(task);
        return task;
    }

    public boolean updateTask(int id, String newDescription) {
        for (Task task : tasks) {
            if (task.id == id) {
                task.description = newDescription;
                task.updatedAt = LocalDateTime.now().toString();
                return true;
            }
        }
        return false;
    }

    public boolean deleteTask(int id) {
        return tasks.removeIf(t -> t.id == id);
    }

    public boolean markStatus(int id, String status) {
        for (Task task : tasks) {
            if (task.id == id) {
                task.status = status;
                task.updatedAt = LocalDateTime.now().toString();
                return true;
            }
        }
        return false;
    }

    public List<Task> listTasks(String filter) {
        if (filter.equals("all")) return tasks;
        List<Task> filtered = new ArrayList<>();
        for (Task task : tasks) {
            if (task.status.equals(filter)) filtered.add(task);
        }
        return filtered;
    }

    public List<Task> getAllTasks() {
        return tasks;
    }
}

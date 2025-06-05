import java.io.File;


public class TaskCLITest {
    public static void main(String[] args) {
        runTests();
    }

    public static void runTests() {
        System.out.println("Running tests...");
        File file = new File("tasks.json");
        if (file.exists()) file.delete();

        TaskManager manager = new TaskManager(TaskStorage.loadTasks());

        // Test: Add Task
        Task task = manager.addTask("Write unit tests");
        assert task.id == 1;
        assert task.description.equals("Write unit tests");

        // Test: Update Task
        boolean updated = manager.updateTask(1, "Write better unit tests");
        assert updated;

        // Test: Mark done
        boolean marked = manager.markStatus(1, "done");
        assert marked;

        // Test: Delete
        boolean deleted = manager.deleteTask(1);
        assert deleted;

        TaskStorage.saveTasks(manager.getAllTasks());

        System.out.println("All tests passed.");
    }
}

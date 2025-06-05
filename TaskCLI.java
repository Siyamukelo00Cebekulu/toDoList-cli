public class TaskCLI {
    public static void main(String[] args) {
        if (args.length < 1) {
            printHelp();
            return;
        }

        String command = args[0];
        TaskManager manager = new TaskManager(TaskStorage.loadTasks());

        switch (command) {
            case "add" -> {
                if (args.length < 2) {
                    printHelp();
                    return;
                }
                Task newTask = manager.addTask(args[1]);
                TaskStorage.saveTasks(manager.getAllTasks());
                System.out.println("Task added successfully (ID: " + newTask.id + ")");
            }
            case "update" -> {
                if (args.length < 3) printHelp();
                else {
                    boolean updated = manager.updateTask(Integer.parseInt(args[1]), args[2]);
                    TaskStorage.saveTasks(manager.getAllTasks());
                    System.out.println(updated ? "Task updated." : "Task not found.");
                }
            }
            case "delete" -> {
                if (args.length < 2) printHelp();
                else {
                    boolean deleted = manager.deleteTask(Integer.parseInt(args[1]));
                    TaskStorage.saveTasks(manager.getAllTasks());
                    System.out.println(deleted ? "Task deleted." : "Task not found.");
                }
            }
            case "mark-done", "mark-in-progress" -> {
                if (args.length < 2) printHelp();
                else {
                    String status = command.equals("mark-done") ? "done" : "in-progress";
                    boolean marked = manager.markStatus(Integer.parseInt(args[1]), status);
                    TaskStorage.saveTasks(manager.getAllTasks());
                    System.out.println(marked ? "Task marked as " + status : "Task not found.");
                }
            }
            case "list" -> {
                String filter = args.length == 2 ? args[1] : "all";
                for (Task task : manager.listTasks(filter)) {
                    System.out.println("#" + task.id + " [" + task.status + "] " + task.description);
                }
            }
            default -> printHelp();
        }
    }

    static void printHelp() {
        System.out.println("Usage:");
        System.out.println("  java TaskCLI add \"description\"");
        System.out.println("  java TaskCLI update <id> \"new description\"");
        System.out.println("  java TaskCLI delete <id>");
        System.out.println("  java TaskCLI mark-in-progress <id>");
        System.out.println("  java TaskCLI mark-done <id>");
        System.out.println("  java TaskCLI list [todo|done|in-progress]");
    }
}

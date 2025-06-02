
import java.io.IOException;

public class Main {

    // entry point: parses CLI args and routes actions
    public static void main(String[] args) throws IOException {

    CliParser cliParser = new CliParser(args);

    switch (cliParser.command) {
        case "add" -> { taskservice.addTask(cliParser.action);}
        case "delete" -> System.out.println("Task deleted");
        case "update" -> System.out.println("Task updated");
        default -> {
            }
        }
    }
}

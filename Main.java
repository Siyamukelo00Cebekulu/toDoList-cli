public class Main {

    // entry point: parses CLI args and routes actions
    public static void main(String[] args) {

    
    switch (args[0]) {
        case "add":
            System.out.println("task added'");
            break;
        case "delete":
            System.out.println("Task deleted");
        case "update":
            System.out.println("Task updated");
        default:
            break;
        }
    }
}

import java.io.IOException;
import java.util.Date;

public class taskservice {
    // contains logic for add, delete and update
    
    public void addTask(String task) throws IOException
    {
        Date now = new Date();
        task newTask = new task(task, taskStatus.TO_DO, now);
        taskStorage.writeFile(newTask.toJson());
        System.out.println("Task ID ("+newTask.getId()+") " +newTask.getDescription() +" created Successfully:");
    }

    public static void deleteTask()
    {

    }

    public static void updateTask()
    {

    }

    public static void listTasks()
    {
        
    }
}

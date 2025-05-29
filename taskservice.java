import java.io.IOException;
import java.util.Date;

public class taskservice {
    // contains logic for add, delete and update
    
    public static void add(String task) throws IOException
    {
        Date now = new Date();
        task newTask = new task(task, taskStatus.TO_DO, now);
        taskStorage.writeFile(newTask.toJson());
        System.out.println("Task ("+newTask.getId()+")" +newTask.getDescription() +" created Successfully:");
    }

    public static void delete()
    {

    }

    public static void update()
    {

    }
}

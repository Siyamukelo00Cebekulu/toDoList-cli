import java.util.Date;

public class task
{
    // model class: represents a task (id, title, status, etc.)
    
    int id;
    String description;
    taskStatus taskStatus;
    Date createdAt;
    Date updatedAt;

    public task(int id, String description,taskStatus taskStatus, Date createdAt, Date updatedAt)
    {
        this.id = id;
        this.description = description;
        this.taskStatus = taskStatus;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
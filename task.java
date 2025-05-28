import java.util.Date;

public class task
{
    // model class: represents a task (id, title, status, etc.)
    
    int id;
    String description;
    taskStatus taskStatus;
    Date createdAt;
    Date updatedAt;

    public task(int id, String description,taskStatus taskStatus, Date createdAt)
    {
        this.id = id;
        this.description = description;
        this.taskStatus = taskStatus;
        this.createdAt = createdAt;
        
    }

    // getters
    public int getId()
    {
        return this.id;
    }
    public String getDescription()
    {
        return this.description;
    }
    public taskStatus geTaskStatus()
    {
        return this.taskStatus;
    }
    public Date getCreatedAtDate()
    {
        return this.createdAt;
    }
    public Date getUpdatedAtDate()
    {
        return this.updatedAt;
    }

    public void updateDescription(String description)
    {
        this.description = description;
    }

    public void updateTaskDate(Date updatedAt)
    {
        this.updatedAt = updatedAt;
    }

    public void updateTaskStatus(taskStatus status)
    {
        this.taskStatus = status;
    }
}
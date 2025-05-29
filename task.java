import java.text.SimpleDateFormat;
import java.util.Date;

public class task
{
    // model class: represents a task (id, title, status, etc.)
    
    public static int id = 0;
    String description;
    taskStatus taskStatus;
    Date createdAt;


    public task(String description,taskStatus taskStatus, Date createdAt)
    {
        id ++;
        this.description = description;
        this.taskStatus = taskStatus;
        this.createdAt = createdAt;
        
    }

    // getters
    public int getId()
    {
        return id;
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
        return this.createdAt;
    }

    public void updateDescription(String description)
    {
        this.description = description;
    }

    public void updateTaskDate(Date updatedAt)
    {
        this.createdAt = updatedAt;
    }

    public void updateTaskStatus(taskStatus status)
    {
        this.taskStatus = status;
    }


    // Format date to ISO-8601 string
    private String formatDate(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        return formatter.format(date);
    }

    // Escape JSON string
    private String escapeJson(String value) {
        return "\"" + value
            .replace("\\", "\\\\")
            .replace("\"", "\\\"")
            .replace("\n", "\\n")
            .replace("\r", "\\r")
            .replace("\t", "\\t") + "\"";
    }

    public String toJson() {
        return "{"
            + "\"id\":" + id + ","
            + "\"description\":" + escapeJson(this.description) + ","
            + "\"taskStatus\":" + escapeJson(this.taskStatus.name()) + ","
            + "\"createdAt\":" + escapeJson(formatDate(this.createdAt)) + ","
            + "\"updatedAt\":" + escapeJson(formatDate(this.createdAt))
            + "}";
    }
}
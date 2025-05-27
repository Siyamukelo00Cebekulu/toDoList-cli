import java.sql.Date;

public class task
{
    int id;
    String description;
    String status;
    Date createdAt;

    public task(int id, String description,String status,Date taskDate)
    {
        this.id = id;
        this.description = description;
        this.status = status;
        this.createdAt = taskDate;
    }

    
}
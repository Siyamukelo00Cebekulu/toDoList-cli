
public class Task {
    public int id;
    public String description;
    public String status;
    public String createdAt;
    public String updatedAt;

    public Task(int id, String description, String status, String createdAt, String updatedAt) {
        this.id = id;
        this.description = description;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public static Task fromJson(String json) {
        json = json.replaceAll("[{}\"]", "");
        String[] parts = json.split(",");
        int id = 0;
        String description = "", status = "", createdAt = "", updatedAt = "";
        for (String part : parts) {
            String[] kv = part.split(":", 2);
            if (kv.length != 2) continue;
            switch (kv[0].trim()) {
                case "id" -> id = Integer.parseInt(kv[1].trim());
                case "description" -> description = kv[1].trim();
                case "status" -> status = kv[1].trim();
                case "createdAt" -> createdAt = kv[1].trim();
                case "updatedAt" -> updatedAt = kv[1].trim();
            }
        }
        return new Task(id, description, status, createdAt, updatedAt);
    }

    public String toJson() {
        return String.format("{\"id\":%d,\"description\":\"%s\",\"status\":\"%s\",\"createdAt\":\"%s\",\"updatedAt\":\"%s\"}",
            id, description, status, createdAt, updatedAt);
    }
}

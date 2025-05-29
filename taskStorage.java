import java.io.*;
import java.nio.file.*;

public class taskStorage {
    private static final String FILE_NAME = "tasks.json";

    public static void ensureFileExists() throws IOException {
        Path path = Paths.get(FILE_NAME);
        if (!Files.exists(path)) {
            Files.write(path, "[]".getBytes());
        }
    }

    public static String readFile() throws IOException {
        return new String(Files.readAllBytes(Paths.get(FILE_NAME)));
    }

    public static void writeFile(String content) throws IOException {
        Files.write(Paths.get(FILE_NAME), content.getBytes());
    }
}

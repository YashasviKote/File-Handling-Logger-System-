import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LoggerService {

    private final String fileName = "log.txt";

    // Write log to file
    public void writeLog(String message) {

        try (FileWriter writer = new FileWriter(fileName, true)) {

            writer.write(message + "\n");

        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }

    // Read logs from file
    public void readLogs() {

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(fileName))) {

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}
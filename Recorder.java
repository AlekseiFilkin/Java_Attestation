import java.io.FileWriter;
import java.io.IOException;

public class Recorder {
    public void writeToFile(toys toy) {
        try (FileWriter writer = new FileWriter("Выигрыши.txt", true)) {
            writer.write(toy.toFileString());
            writer.write("\n");
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

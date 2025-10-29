package pl.kul.medicalsurveysbe.file;

import org.springframework.stereotype.Service;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@Service
public class FileService {

    public void saveToFile(List<String> data, String filename) {
        Path filePath = Path.of(filename);
        try (BufferedWriter writer = Files.newBufferedWriter(filePath, StandardCharsets.UTF_8)) {
            for (String line : data) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException("Błąd podczas zapisywania pliku: " + filename, e);
        }
    }
}

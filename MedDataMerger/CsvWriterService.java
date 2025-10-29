package pl.kul.medicalsurveysbe.file;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CsvWriterService {

    public List<String> formatCsvData(List<String> headers, List<List<String>> rows) {
        if (headers == null || rows == null || headers.isEmpty()) {
            throw new IllegalArgumentException("Nagłówki lub dane są puste!");
        }

        // Formatowanie nagłówków
        List<String> formattedData = rows.stream()
                .map(row -> String.join(";", row)) // Tab jako separator
                .collect(Collectors.toList());

        // Dodanie nagłówków na początku
        formattedData.add(0, String.join(";", headers));
        return formattedData;
    }
}

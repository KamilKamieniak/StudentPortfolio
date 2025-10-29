# StudentPortfolio

Zbiór projektów studenckich w języku **Java**, zrealizowanych w ramach nauki programowania oraz zajęć z przetwarzania danych, integracji systemów i automatyzacji procesów.  
Każdy projekt prezentuje inne praktyczne zastosowanie technologii Java w różnych kontekstach.

---

## Projekty

### 1. MedDataMerger
**Tematyka:** przetwarzanie i integracja danych medycznych  
**Charakter projektu:** projekt programistyczny realizowany zespołowo w ramach koła naukowego  

**Opis:**  
Projekt stanowi moduł integrujący dane z ankiet medycznych pozyskanych z różnych źródeł (m.in. CSV, OCR).  
Zadaniem mojej części projektu było opracowanie i implementacja logiki odpowiedzialnej za:  
- formatowanie danych wejściowych do jednolitego układu kolumn,  
- zapis wyników do pliku CSV z obsługą błędów,  
- testowanie logiki przetwarzania danych.  

**Technologie:**  
`Java 17`, `Spring Boot`, `Java NIO`, `Stream API`

**Struktura:**  
- `CsvWriterService` – formatowanie danych wejściowych  
- `FileService` – zapis danych do pliku wynikowego  
- `DataProcessingService` – integracja i testy  

---

### 2. WeatherForecastApp
**Tematyka:** analiza danych meteorologicznych i prognozowanie pogody  

**Opis:**  
Aplikacja służy do pobierania, zapisywania i prognozowania temperatury na podstawie danych z plików CSV, bazy danych MySQL oraz API OpenWeather.  
Umożliwia użytkownikowi pobieranie bieżących danych pogodowych, analizę trendów historycznych oraz generowanie prognoz dla kolejnych godzin.

**Zakres funkcjonalności:**  
- odczyt danych z plików CSV,  
- zapis i odczyt danych z bazy MySQL,  
- pobieranie danych z API OpenWeather,  
- prognozowanie temperatury dla kolejnej doby,  
- konsolowy interfejs użytkownika.  

**Technologie:**  
`Java 17`, `JDBC`, `MySQL`, `OpenWeather API`, `JSON`, `I/O`, `NIO`

**Struktura:**  
- `CsvReader` – wczytywanie danych z CSV  
- `DatabaseService` – obsługa MySQL  
- `WeatherApiClient` – połączenie z API  
- `TemperaturePredictor` – prognozowanie temperatury  
- `TemperatureData` / `TemperatureEntry` – model danych  

---

### 3. DeclarationGeneratorApp
**Tematyka:** automatyzacja dokumentów i przetwarzanie danych osobowych  

**Opis:**  
Aplikacja w języku Java generująca automatycznie pliki DOCX z deklaracjami członkowskimi koła naukowego na podstawie danych z pliku CSV.  
Dla każdej osoby tworzony jest osobny dokument zawierający imię, nazwisko, adres e-mail oraz numer telefonu.

**Zakres funkcjonalności:**  
- odczyt danych z pliku CSV,  
- generowanie dokumentów Word (DOCX),  
- zapis do katalogu `deklaracje/`,  
- obsługa błędów i walidacja danych wejściowych.  

**Technologie:**  
`Java 17`, `Apache POI`, `I/O API`, `CSV`

**Struktura:**  
- `Main` – punkt wejścia programu  
- `Person` – model danych  
- `CsvReaderService` – odczyt danych z pliku  
- `DocxGeneratorService` – tworzenie dokumentów DOCX

## Autor

**Kamil Kamieniak**  
Informatyka KUL

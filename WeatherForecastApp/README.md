# WeatherForecastApp

Aplikacja do pobierania, zapisywania i prognozowania temperatury na podstawie danych z plików CSV, bazy danych MySQL oraz API OpenWeather.  
Projekt umożliwia użytkownikowi przeglądanie aktualnej pogody, analizę danych historycznych oraz prognozę temperatury dla kolejnych godzin.

---

## Zakres funkcjonalności
- Odczyt danych z plików CSV (`CsvReader`)
- Zapis i odczyt danych z bazy danych MySQL (`DatabaseService`)
- Pobieranie bieżących danych pogodowych z API OpenWeather (`WeatherApiClient`)
- Prognozowanie temperatury na kolejną dobę (`TemperaturePredictor`)
- Konsolowy interfejs użytkownika (`TemperatureApp`)

---

## Technologie
- Java 17  
- JDBC (MySQL)  
- OpenWeather API  
- JSON (org.json)  
- I/O, NIO  

---

## Struktura projektu
- **TemperatureApp.java** – główny punkt wejścia programu  
- **CsvReader.java** – odczyt danych z plików CSV  
- **DatabaseService.java** – zapis i odczyt danych z MySQL  
- **WeatherApiClient.java** – pobieranie aktualnej temperatury z API  
- **TemperaturePredictor.java** – generowanie prognoz godzinowych  
- **TemperatureEntry.java / TemperatureData.java** – model danych  

---

## Uruchomienie
1. Utwórz lokalną bazę danych MySQL `temperature_base` z tabelą:
   ```sql
   CREATE TABLE temperature (
     id INT AUTO_INCREMENT PRIMARY KEY,
     date VARCHAR(20),
     day_of_week INT,
     hour VARCHAR(5),
     temperature DOUBLE
   );

## Przykład działania

TemperatureApp:
1. Aktualna pogoda (pobierz z API)
2. Szacowanie temperatury na podstawie pliku CSV
3. Szacowanie temperatury na podstawie danych z bazy
4. Zapisz dane z pliku CSV do bazy
5. Wyjście

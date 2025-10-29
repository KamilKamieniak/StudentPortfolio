# MedDataMerger

Projekt stanowi moduł integrujący dane z ankiet medycznych pozyskanych z różnych źródeł (CSV oraz OCR). 
Moja część projektu obejmowała opracowanie i implementację warstwy odpowiedzialnej za formatowanie danych 
oraz ich zapis do pliku wynikowego w formacie CSV.

## Zakres mojej pracy
- Implementacja klasy **CsvWriterService** do formatowania danych wejściowych w spójny układ kolumn.
- Implementacja klasy **FileService** do bezpiecznego zapisu wyników w pliku CSV (obsługa błędów zapisu).
- Testy modułu w ramach pakietu `service`.
- Integracja z logiką przetwarzania danych (klasa `DataProcessingService`).

## Technologie
- Java 17
- Spring Boot
- Java NIO (zapis plików)
- Stream API

## Uruchomienie
1. Sklonuj repozytorium.
2. Otwórz projekt w IntelliJ IDEA (lub innym środowisku z Mavenem).
3. Uruchom klasę `MedicalSurveysBEApplication`.
4. Wynikowe pliki CSV generowane są w katalogu `/output` po zakończeniu przetwarzania danych.

## Przykładowy opis działania
1. Dane ankiet wczytywane są z plików CSV oraz OCR.
2. Moduł **CsvWriterService** formatuje dane i scala je w spójną strukturę.
3. Klasa **FileService** zapisuje wynik do pliku wynikowego 

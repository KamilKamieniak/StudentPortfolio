# DeclarationGeneratorApp

Aplikacja w języku **Java**, służąca do automatycznego generowania plików DOCX z deklaracjami członkowskimi koła naukowego na podstawie danych z pliku CSV.

---

## Opis projektu

Projekt przetwarza dane członków (imię, nazwisko, e-mail, telefon) z pliku CSV i dla każdej osoby generuje osobny dokument DOCX z wypełnioną deklaracją członkowską.  
Aplikacja może być wykorzystywana np. w organizacjach studenckich lub kołach naukowych do szybkiego przygotowywania dokumentów zgłoszeniowych.

---

## Zakres funkcjonalności

- Odczyt danych członków z pliku CSV (`CsvReaderService`)
- Generowanie plików `.docx` dla każdej osoby (`DocxGeneratorService`)
- Tworzenie folderu docelowego i zapis plików w strukturze projektu
- Obsługa błędów odczytu i zapisu plików

---

## Struktura projektu

| Pakiet / Klasa | Opis |
|----------------|------|
| `com.university.main.Main` | Punkt wejścia programu |
| `com.university.model.Person` | Model danych jednej osoby |
| `com.university.service.CsvReaderService` | Odczyt danych z pliku CSV |
| `com.university.service.DocxGeneratorService` | Tworzenie pliku DOCX na podstawie danych |

---

## Technologie

- Java 17  
- Apache POI (biblioteka do obsługi plików Word DOCX)  
- I/O API (odczyt i zapis plików)  
- CSV jako źródło danych  

---

## Uruchomienie

1. Przygotuj plik `czlonkowie.csv` w katalogu projektu, np.:
ID Imię Nazwisko Email Telefon

1 Jan Kowalski jan.kowalski@example.com

2 Anna Nowak anna.nowak@example.com

3. Uruchom klasę `Main.java`.

4. W folderze `deklaracje` pojawią się automatycznie wygenerowane pliki DOCX (np. `Deklaracja_Jan_Kowalski.docx`).



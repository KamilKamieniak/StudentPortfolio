package com.university.main;

import com.university.model.Person;
import com.university.service.CsvReaderService;
import com.university.service.DocxGeneratorService;

import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String inputCsv = "./czlonkowie.csv";
        String outputDir = "deklaracje";

        CsvReaderService csvService = new CsvReaderService();
        DocxGeneratorService docxService = new DocxGeneratorService();

        File dir = new File(outputDir);
        if (!dir.exists()) {
            boolean created = dir.mkdirs();
            System.out.println("Folder deklaracje stworzony: " + created);
        }

        List<Person> people = csvService.readFromCsv(inputCsv);
        System.out.println("Wczytano osób: " + people.size());

        for (Person person : people) {
            System.out.println("Generuję deklarację dla: " + person.getFirstName() + " " + person.getLastName());
            docxService.generateDeclaration(person, outputDir);
        }

        System.out.println("Wygenerowano wszystkie deklaracje!");
    }
}

package com.university.service;

import com.university.model.Person;
import java.io.*;
import java.util.*;

public class CsvReaderService {

    public List<Person> readFromCsv(String filePath) {
        List<Person> people = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) {
                    continue;
                }

                String[] parts = line.split("\\s+");
                if (parts.length >= 5) {
                    String firstName = parts[1].trim();
                    String lastName = parts[2].trim();
                    String email = parts[3].trim();
                    String phone = parts[4].trim();
                    people.add(new Person(firstName, lastName, email, phone));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return people;
    }
}

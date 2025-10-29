package com.university.service;

import com.university.model.Person;
import org.apache.poi.xwpf.usermodel.*;

import java.io.FileOutputStream;
import java.io.IOException;

public class DocxGeneratorService {

    public void generateDeclaration(Person person, String outputDir) {

        String fileName = outputDir + "/Deklaracja_" +
                person.getFirstName() + "_" + person.getLastName() + ".docx";

        try (XWPFDocument document = new XWPFDocument()) {

            XWPFParagraph title = document.createParagraph();
            title.setAlignment(ParagraphAlignment.CENTER);
            XWPFRun titleRun = title.createRun();
            titleRun.setText("Deklaracja członkowska");
            titleRun.setBold(true);
            titleRun.setFontSize(16);

            XWPFParagraph content = document.createParagraph();
            XWPFRun run = content.createRun();
            run.setText("Ja, " + person.getFirstName() + " " + person.getLastName() + ",");
            run.addBreak();
            run.setText("adres e‑mail: " + person.getEmail());
            run.addBreak();
            run.setText("telefon: " + person.getPhone());
            run.addBreak();
            run.addBreak();
            run.setText("Niniejszym deklaruję chęć przystąpienia do koła naukowego.");
            run.addBreak();
            run.addBreak();
            run.setText(".......................................................");
            run.addBreak();
            run.setText("Podpis");

            try (FileOutputStream out = new FileOutputStream(fileName)) {
                document.write(out);
            }

            System.out.println("Utworzono plik: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

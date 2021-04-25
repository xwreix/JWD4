package by.epamtc.task3;

import by.epamtc.service.DataScanner;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String line = null;
        try {
            line = DataScanner.getStringFromFile(new File("text.txt").getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(Logic.replaceWordCharRealization(line, "hhh", 4) + "\n");
        System.out.println(Logic.replaceWordRegexRealization(line, "aw", 3) + "\n");
        System.out.println(Logic.replaceWordStringRealization(line, "qwer", 2) + "\n");
    }
}

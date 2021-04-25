package by.epamtc.task5;

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
        System.out.println(Logic.deleteWordsCharRealization(line, 2) + "\n");
        System.out.println(Logic.deleteWordsStringRealization(line, 3) + "\n");
        System.out.println(Logic.deleteWordsRegexRealization(line, 4) + "\n");
    }
}

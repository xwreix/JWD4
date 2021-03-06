package by.epamtc.task1;

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
        System.out.println(Logic.changeLetterCharRealization(line, 2, 'p') + "\n");
        System.out.println(Logic.changeLetterStringRealization(line, 1, 'q') + "\n");
        System.out.println(Logic.changeLetterRegexRealization(line, 3, 'w') + "\n");
    }
}

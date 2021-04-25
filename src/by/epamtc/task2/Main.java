package by.epamtc.task2;

import by.epamtc.service.DataScanner;

public class Main {

    public static void main(String[] args) {
        String line = DataScanner.getStringFromConsole();
        System.out.println(Logic.correctMistakeCharRealization(line) + "\n");
        System.out.println(Logic.correctMistakeStringRealization(line) + "\n");
        System.out.println(Logic.correctMistakeRegexRealization(line) + "\n");
    }

}

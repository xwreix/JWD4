package by.epamtc.task4;

import by.epamtc.service.DataScanner;

public class Main {
    public static void main(String[] args) {
        String line = DataScanner.getStringFromConsole();
        System.out.println(Logic.deleteSymbolsCharRealization(line) + "\n");
        System.out.println(Logic.deleteSymbolsStringRealization(line) + "\n");
        System.out.println(Logic.deleteSymbolsRegexRealization(line) + "\n");
    }
}

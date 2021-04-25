package by.epamtc.task4;

import by.epamtc.service.CharService;

import java.util.ArrayList;

public class Logic {

    public static String deleteSymbolsCharRealization(String string) {
        checker(string);

        ArrayList<Character> word = new ArrayList<>();
        ArrayList<Character> builder = new ArrayList<>();
        string = string.concat("/");
        char[] line = string.toCharArray();

        for (int i = 0; i < line.length; i++) {
            if (CharService.isLetter(line[i])) {
                word.add(line[i]);
            } else if (word.size() != 0) {
                builder.addAll(word);
                builder.add(' ');
                word.removeAll(word);
            }
        }

        String result = CharService.charToString(builder);
        return result;
    }

    public static String deleteSymbolsStringRealization(String line) {
        checker(line);

        StringBuilder builder = new StringBuilder();
        StringBuilder word = new StringBuilder();
        line = line.concat(" ");

        for (int i = 0; i < line.length(); i++) {
            if (CharService.isLetter(line.charAt(i))) {
                word.append(line.charAt(i));
            } else if (word.length() != 0) {
                builder.append(word).append(" ");
                word = new StringBuilder();
            }
        }

        return builder.toString();
    }

    public static String deleteSymbolsRegexRealization(String line) {
        checker(line);
        StringBuilder result = new StringBuilder();

        for (String word : line.split("\\W+")) {
            result.append(word).append(" ");
        }

        return result.toString();
    }

    private static void checker(String string) {
        if (string == null) {
            //throw exception "String doesn't exist"
        }
    }
}

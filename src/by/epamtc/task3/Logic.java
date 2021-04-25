package by.epamtc.task3;

import by.epamtc.service.CharService;

import java.util.ArrayList;

public class Logic {

    public static String replaceWordCharRealization(String string, String replacementString, int length) {
        checker(string, replacementString, length);

        ArrayList<Character> builder = new ArrayList<>();
        ArrayList<Character> word = new ArrayList<>();
        char[] line = string.concat(" ").toCharArray();
        char[] replacement = replacementString.toCharArray();

        for (int i = 0; i < line.length; i++) {
            if (CharService.isLetter(line[i])) {
                word.add(line[i]);
            } else if (word.size() == length) {
                for (Character x : replacement) {
                    builder.add(x);
                }
                builder.add(line[i]);
                word.removeAll(word);
            } else {
                builder.addAll(word);
                word.removeAll(word);
                builder.add(line[i]);
            }
        }

        builder.remove(builder.size() - 1);
        String result = CharService.charToString(builder);
        return result;
    }

    public static String replaceWordStringRealization(String line, String replacement, int length) {
        checker(line, replacement, length);

        StringBuilder word = new StringBuilder();
        StringBuilder builder = new StringBuilder();

        line = line.concat(" ");

        for (int i = 0; i < line.length(); i++) {
            if (CharService.isLetter(line.charAt(i))) {
                word.append(line.charAt(i));
            } else if (word.length() == length) {
                builder.append(replacement).append(line.charAt(i));
                word = new StringBuilder();
            } else if (word.length() >= 1) {
                builder.append(word).append(line.charAt(i));
                word = new StringBuilder();
            } else {
                builder.append(line.charAt(i));
            }
        }

        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();
    }

    public static String replaceWordRegexRealization(String line, String replacement, int length) {
        checker(line, replacement, length);

        for (String word : line.split("\\W+")) {
            if (word.length() == length) {
                line = line.replaceAll("\\b" + word + "\\b", replacement);
            }
        }

        return line;
    }

    private static void checker(String line, String replacement, int length) {
        if (line == null || replacement == null) {
            //throw exception "String doesn't exist"
        } else if (length < 0) {
            //throw exception "Length must be positive"
        }
    }

}


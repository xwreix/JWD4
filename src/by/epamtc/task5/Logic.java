package by.epamtc.task5;

import by.epamtc.service.CharService;

import java.util.ArrayList;

public class Logic {

    public static String deleteWordsCharRealization(String string, int length) {
        checker(string, length);

        char[] line = string.concat(" ").toCharArray();
        ArrayList<Character> builder = new ArrayList<>();
        ArrayList<Character> word = new ArrayList<>();

        for (int i = 0; i < line.length; i++) {
            if (CharService.isLetter(line[i])) {
                word.add(line[i]);
            } else if (word.size() == length && isConsonant(word.get(0))) {
                word.removeAll(word);
            } else {
                builder.addAll(word);
                builder.add(line[i]);
                word.removeAll(word);
            }
        }

        String result = CharService.charToString(builder);
        return result;
    }

    public static String deleteWordsStringRealization(String line, int length) {
        checker(line, length);

        line = line.concat(" ");
        StringBuilder builder = new StringBuilder(line);
        StringBuilder word = new StringBuilder();
        int index = 0;

        for (int i = 0; i < line.length(); i++) {
            if (CharService.isLetter(line.charAt(i))) {
                word.append(line.charAt(i));
                index++;
            } else if (word.length() == length && isConsonant(word.charAt(0))) {
                builder.delete(index - length, index);
                index -= length;
                word = new StringBuilder();
            } else {
                word = new StringBuilder();
                index++;
            }
        }

        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();
    }

    public static String deleteWordsRegexRealization(String line, int length) {
        checker(line, length);

        for (String word : line.split("\\W+")) {
            if (word.matches("^[^aeiouyAEIOUY]\\w++") && word.length() == length) {
                line = line.replaceAll("\\b" + word + "\\b", "");
            }
        }

        return line;
    }

    private static void checker(String line, int length) {
        if (line == null) {
            //throw exception "String doesn't exist"
        } else if (length <= 0) {
            //throw exception "length must be positive"
        }
    }

    private static boolean isConsonant(char x) {
        return x != 'A' && x != 'a' && x != 'E' && x != 'e' && x != 'I' && x != 'i' &&
                x != 'O' && x != 'o' && x != 'U' && x != 'u' && x != 'Y' && x != 'y';
    }

    private static ArrayList<Character> stringToList(String line) {
        ArrayList<Character> result = new ArrayList<>();
        for (int i = 0; i < line.length(); i++) {
            result.add(line.charAt(i));
        }
        return result;
    }
}

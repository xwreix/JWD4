package by.epamtc.task1;

import static by.epamtc.service.CharToString.charToString;

public class Logic {

    public static String changeLetterCharRealization(String string, int k, char symbol) {
        checker(string, k);

        char[] line = string.toCharArray();

        int length = 0;
        for (int i = 0; i < line.length; i++) {
            if (isLetter(line[i])) {
                length++;
            } else {
                length = 0;
            }
            if (k == length) {
                line[i] = symbol;
            }
        }
        String result = charToString(line);
        return result;
    }

    public static String changeLetterStringRealization(String line, int k, char symbol) {
        checker(line, k);

        StringBuilder builder = new StringBuilder();
        StringBuilder word = new StringBuilder();
        int i = 0;

        while (i < line.length()) {

            while (isLetter(line.charAt(i))) {
                word.append(line.charAt(i));

                if (i != line.length() - 1) {
                    i++;
                } else {
                    break;
                }

            }

            if (word.length() >= k) {
                builder.append(word, 0, k - 1).append(symbol).append((word.substring(k)));

            } else if (word.length() >= 1) {
                builder.append(word);
            }

            builder.append(line.charAt(i));
            i++;
            word = new StringBuilder("");
        }

        return builder.toString();
    }

    public static String changeLetterRegexRealization(String line, int k, char symbol) {
        checker(line, k);
        StringBuilder builder = new StringBuilder();

        for (String word : line.split("\\W+")) {

            if (word.length() >= k) {
                builder.append(word, 0, k - 1).append(symbol).append(word.substring(k));
            } else {
                builder.append(word);
            }

            builder.append(" ");
        }

        return builder.toString();
    }

    private static void checker(String line, int k) {
        if (line == null) {
            //throw exception "Line doesn't exist"
        } else if (k < 0) {
            //throw exception "Number of the position must be positive"
        }
    }

    private static boolean isLetter(char symbol) {
        boolean result = false;

        if (symbol >= 'A' && symbol <= 'Z' || symbol >= 'a' && symbol <= 'z') {
            result = true;
        }

        return result;
    }
}


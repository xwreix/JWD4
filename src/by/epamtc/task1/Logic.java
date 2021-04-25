package by.epamtc.task1;


import by.epamtc.service.CharService;

public class Logic {

    public static String changeLetterCharRealization(String string, int k, char symbol) {
        checker(string, k);

        char[] line = string.toCharArray();

        int length = 0;
        for (int i = 0; i < line.length; i++) {
            if (CharService.isLetter(line[i])) {
                length++;
            } else {
                length = 0;
            }
            if (k == length) {
                line[i] = symbol;
            }
        }
        String result = CharService.charToString(line);
        return result;
    }

    public static String changeLetterStringRealization(String line, int k, char symbol) {
        checker(line, k);

        StringBuilder builder = new StringBuilder();
        StringBuilder word = new StringBuilder();
        line = line.concat("/");

        for (int i = 0; i < line.length(); i++) {
            if (CharService.isLetter(line.charAt(i))) {
                word.append(line.charAt(i));
            } else if (word.length() >= k) {
                builder.append(word, 0, k - 1).append(symbol).
                        append((word.substring(k))).append(line.charAt(i));
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

    public static String changeLetterRegexRealization(String line, int k, char symbol) {
        checker(line, k);

        char[] r = {symbol};
        String replacement = CharService.charToString(r);

        for (String word : line.split("\\W+")) {
            if (word.length() >= k) {
                StringBuilder builder = new StringBuilder(word);
                builder.replace(k - 1, k, replacement);
                line = line.replaceFirst("\\b" + word + "\\b", builder.toString());
            }
        }

        return line;
    }

    private static void checker(String line, int k) {
        if (line == null) {
            //throw exception "Line doesn't exist"
        } else if (k < 0) {
            //throw exception "Number of the position must be positive"
        }
    }
}


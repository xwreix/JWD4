package by.epamtc.task2;

import static by.epamtc.service.CharToString.charToString;

public class Logic {

    public static String correctMistakeCharRealization(String string) {
        checker(string);

        char[] line = string.toCharArray();
        for (int i = 0; i < line.length - 1; i++) {
            if (line[i] == 'P' && line[i + 1] == 'A') {
                line[i + 1] = 'O';
            }
        }

        String result = charToString(line);

        return result;
    }

    public static String correctMistakeStringRealization(String line) {
        checker(line);
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < line.length() - 1; i++) {
            builder.append(line.charAt(i));
            if (line.charAt(i) == 'P' && line.charAt(i + 1) == 'A') {
                builder.append('O');
                i++;
            }
        }
        builder.append(line.charAt(line.length()-1));

        return builder.toString();
    }


    public static String correctMistakeRegexRealization(String line) {
        checker(line);

        String result = line.replaceAll("PA", "PO");

        return result;
    }

    private static void checker(String string) {
        if (string == null) {
            //throw exception "String doesn't exist"
        }
    }

}


package by.epamtc.service;

import java.util.ArrayList;

public class CharService {

    public static String charToString(char[] line) {
        StringBuilder builder = new StringBuilder();
        builder.append(line);
        String result = builder.toString();
        return result;
    }
    public static String charToString(ArrayList<Character> array) {
        StringBuilder builder = new StringBuilder();
        for (Character x : array) {
            builder.append(x);
        }
        return builder.toString();
    }

    public static boolean isLetter(char symbol) {
        boolean result = false;

        if (symbol >= 'A' && symbol <= 'Z' || symbol >= 'a' && symbol <= 'z') {
            result = true;
        }

        return result;
    }
}

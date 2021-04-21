package by.epamtc.service;

public class CharToString {
    public static String charToString(char[] line) {
        StringBuilder builder = new StringBuilder();
        builder.append(line);
        String result = builder.toString();
        return result;
    }
}

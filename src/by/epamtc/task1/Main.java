package by.epamtc.task1;

public class Main {
    public static void main(String[] args) {
        String line1 = "(pfser) fdzg, hdawf, g, skew*";
        String line  = "frt, l,   hjfds, lgy";
        line = Logic.changeLetterRegexRealization(line1, 2, 't');
       // Logic.changeLetterRegexRealization(line1, 2, 't');
        System.out.println(line);

    }
}

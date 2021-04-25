package by.epamtc.service;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class DataScanner {

    public static String getStringFromConsole(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String string = in.nextLine();
        in.close();
        return string;
    }

    public static String getStringFromFile(String filename) throws IOException {
        Scanner scanner = new Scanner(Paths.get(filename));
        String string = scanner.useDelimiter("\\A").next();
        scanner.close();
        return string;
    }
}


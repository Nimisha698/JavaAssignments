package javaassignment1;

import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            SearchHomeDirectory searchHomeDirectory = new SearchHomeDirectory();
            searchHomeDirectory.findFiles(input);
        }
    }
}

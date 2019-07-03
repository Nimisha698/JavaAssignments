package javaassignment2;

import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.next();
        CheckInput checkInput=new CheckInput();
        checkInput.checkIfInputContainsLetters(input);
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(26)
 */
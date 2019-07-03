package javaassignment2;

import java.util.*;

public class CheckInput {
    public void checkIfInputContainsLetters(String input)
    {
        input=input.toLowerCase();
        HashSet<Character> hashSet=new HashSet<>();
        for(int i=0;i<input.length();i++)
        {
            char character=input.charAt(i);
            if(hashSet.size()==26)
            {
                break;
            }
            if(Character.isLetter(character))
            {
                hashSet.add(character);
            }
        }
        if(hashSet.size()==26)
        {
            System.out.println("All letters are there");
        }
        else
            System.out.println("Not all the letters are there");
    }
}

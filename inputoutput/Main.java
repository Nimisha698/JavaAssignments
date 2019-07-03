package inputoutput;

import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException
    {
        CountCharacters countCharacters=new CountCharacters();
        countCharacters.countOccurenceOfCharacters(args[0]);
    }
}

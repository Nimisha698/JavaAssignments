package inputoutput;
import java.util.*;
import java.io.*;
public class CountCharacters {
    public void countOccurenceOfCharacters(String fileName) throws IOException
    {
        FileReader fr =new FileReader(fileName);

        int charInFile;
        HashMap<Character,Integer> hashMap=new HashMap<>();
        while ((charInFile=fr.read()) != -1)
        {
            if(!hashMap.containsKey((char)charInFile))
            {
                hashMap.put((char)charInFile,1);
            }
            else
            {
                int occurence=hashMap.get((char)charInFile);
                occurence=occurence+1;
                hashMap.put((char)charInFile,occurence);
            }
        }
        for(char charInMap:hashMap.keySet())
        {
            System.out.println(charInMap+" "+hashMap.get(charInMap));
        }
    }
}
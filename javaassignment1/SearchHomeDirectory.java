package javaassignment1;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class SearchHomeDirectory {
    public void findFiles(String regex){
    File directory = new File("/home/zadmin");
   // String regex="^[A-Z]+[A-Za-z]*";
        FilenameFilter filter = new FilenameFilter() {
            public boolean accept(File directory, String name) {
                return name.matches(regex);
            }
        };

    File[] matchingFileNames = directory.listFiles(filter);
      if (matchingFileNames==null)
      {
        System.out.println("Either directory does not exist or is not a directory");
      }
      else {
        for (int i = 0; i< matchingFileNames.length; i++) {
            File filename = matchingFileNames[i];
            System.out.println(filename);
        }
    }
}
}

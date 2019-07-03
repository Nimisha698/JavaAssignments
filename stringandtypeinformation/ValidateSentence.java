package stringandtypeinformation;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ValidateSentence {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        Pattern pattern = Pattern.compile("^[A-Z]+[A-Za-z0-9\\s]*[.]$");
        Matcher matcher = pattern.matcher(input);
        boolean isValidSentence=false;
        while (matcher.find())
        {
            isValidSentence=true;
            System.out.println("Valid sentence");
        }
        if(!isValidSentence)
            System.out.println("Not a valid sentence");
    }
}
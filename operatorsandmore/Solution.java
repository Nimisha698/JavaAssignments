package operatorsandmore;
import com.sun.org.apache.xerces.internal.parsers.IntegratedParserConfiguration;
import java.util.*;
public class Solution
{
    public void vampireNumbers()
    {
        int firstFactor=10;
        int lastFactor=100;
        int countVampireNumbers=0;
        for(int i=firstFactor+1;i<lastFactor;i++)
        {
            for(int j=i;j<lastFactor && countVampireNumbers<100;j++)
            {

                int number=i*j;
                int numofdigits=numberOfDigits(number);

                if(numofdigits%2==0)
                {
                    String numToString=Integer.toString(number);
                    String factors=Integer.toString(i)+ Integer.toString(j);
                    char[] numToStringArray=numToString.toCharArray();
                    char[] factorsArray=factors.toCharArray();
                    Arrays.sort(numToStringArray);
                    Arrays.sort(factorsArray);
                    boolean isVampireNumber=Arrays.equals(numToStringArray,factorsArray);
                    if(isVampireNumber) {
                        System.out.println(numToString);
                        countVampireNumbers++;
                    }
                }
                if(number==(lastFactor-1)*(lastFactor-1))
                {
                    firstFactor*=10;
                    lastFactor*=100;
                    break;
                }

            }
        }
    }
    public static int numberOfDigits(int num)
    {
        int countNumOfDigits=0;
        while(num!=0)
        {
            num=num/10;
            countNumOfDigits++;
        }
        return countNumOfDigits;
    }
}

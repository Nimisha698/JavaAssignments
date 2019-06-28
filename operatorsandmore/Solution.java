package operatorsandmore;

import com.sun.org.apache.xerces.internal.parsers.IntegratedParserConfiguration;
import java.util.*;
/*  A vampire number v is a number with an even number of digits n,
that can be factored into two numbers x and y each with n/2 digits and not both with trailing zeroes,
 where v contains precisely all the digits from x and from y, in any order.
 Write a java program to print first 100 vampire numbers.
 */
public class Solution
{
    public void vampireNumbers()
    {

        for(int i=11;i<=99;i++)
        {
            for(int j=i;j<=99;j++)
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
                    if(isVampireNumber)
                        System.out.println(numToString);
                    i++;
                    j++;
                }
                else{
                i++;
                j++;}
            }
        }
    }
    public static int numberOfDigits(int num)
    {
        int count=0;
        while(num!=0)
        {
            num=num/10;
            count++;
        }
        return count;
    }
}

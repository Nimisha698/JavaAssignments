package javaassignment4;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        int numberOfInputs=sc.nextInt();
        KYCFilling kycFilling=new KYCFilling();
        String[][] ranges=kycFilling.provideRange(numberOfInputs);
        for(int i=0;i<numberOfInputs;i++)
            System.out.println(ranges[i][0]+" "+ranges[i][1]);
    }
}

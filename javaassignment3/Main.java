package javaassignment3;
import java.util.*;
public class Main {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        String ipAddress=scanner.next();
        PingMedianTime pingMedianTime=new PingMedianTime();
        pingMedianTime.calculateTime(ipAddress);
    }
}

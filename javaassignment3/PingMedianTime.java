package javaassignment3;

import java.net.InetAddress;
import java.util.GregorianCalendar;

public class PingMedianTime {

    public void calculateTime(String ipAddress) {

        try {

            InetAddress inet = InetAddress.getByName(ipAddress);
            long finishTime = 0;
            long startTime = new GregorianCalendar().getTimeInMillis();
            if (inet.isReachable(5000)){
                finishTime = new GregorianCalendar().getTimeInMillis();
                System.out.println("Ping median time: " + (finishTime - startTime+ "ms"));
            } else {
                System.out.println(ipAddress + " is not reachable.");
            }
        } catch ( Exception e ) {
            System.out.println("Exception:" + e.getMessage());
        }
    }
}
package javaassignment4;

import java.time.LocalDate;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Scanner;
import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.GregorianCalendar;
public class KYCFilling {
    public  String[][] provideRange(int numberOfInputs) throws Exception{
        Scanner scanner=new Scanner(System.in);
        String[][] ranges=new String[numberOfInputs+1][2];
        int index=0;
        for(int i=0;i<numberOfInputs;i++)
        {
            String formDateInput=scanner.next();
            String currentDateInput=scanner.next();
            Date formDate=new SimpleDateFormat("dd-MM-yyyy").parse(formDateInput);
            Date currentDate=new SimpleDateFormat("dd-MM-yyyy").parse(currentDateInput);
         //   SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

            if(formDate.compareTo(currentDate)>0)
            {
                ranges[index][0]="No range";
                ranges[index++][1]="";
            }
            else {
                    String anniversary = formDateInput.substring(0, 5) + currentDateInput.substring(5);
                    Date anniversaryInCurrentYear = new SimpleDateFormat("dd-MM-yyyy").parse(anniversary);
                    Date endRange = addDays(anniversaryInCurrentYear, 30);
                    Date startRange = subtractDays(anniversaryInCurrentYear, 30);
                    DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                    if (endRange.compareTo(currentDate) > 0) {
                        endRange = currentDate;
                    }
                    ranges[index][0] = dateFormat.format(startRange);
                    ranges[index++][1] = dateFormat.format(endRange);
            }

        }
        return ranges;
    }
    public static Date addDays(Date date, int days) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, days);

        return calendar.getTime();
    }
    public static Date subtractDays(Date date, int days) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(Calendar.DATE,-days);

        return calendar.getTime();
    }
}

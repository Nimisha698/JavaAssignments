package accesscontrolandmore.task4;

import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        System.out.println("Enter the type of cycle");
        Scanner sc=new Scanner(System.in);
        String type=sc.next();
        Cycle object=null;
        if(type.equals("Bicycle"))
        {
            BicycleFactory bicycleFactory=new BicycleFactory();
            object=bicycleFactory.getType();
            object.ride();
        }
        else if(type.equals("Unicycle"))
        {
            UnicycleFactory unicycleFactory=new UnicycleFactory();
            object=unicycleFactory.getType();
            object.ride();
        }
        else if(type.equals("Tricycle"))
        {
            TricycleFactory tricycleFactory=new TricycleFactory();
            object=tricycleFactory.getType();
            object.ride();
        }
    }
}

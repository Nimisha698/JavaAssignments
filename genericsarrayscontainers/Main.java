package genericsarrayscontainers;

import java.awt.*;
import java.util.*;
public class Main {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        SList sList=new SList();
        SListIterator sListIterator=sList.iterator();

        System.out.println("Enter 1 to insert data into the linked list");
        int choice=scanner.nextInt();

        if(choice==1)
        {
            System.out.println("Enter the number of elements you want to insert");
            int numberOfElements=scanner.nextInt();
            System.out.println("Enter the elements");
            for(int i=0;i<numberOfElements;i++) {
                int data = scanner.nextInt();
                sListIterator.insert(sList, sList.head, data);
            }
            System.out.println(sList);
            System.out.println("Enter 2 to delete data from the linked list");
            choice=scanner.nextInt();
            if(choice==2){
                System.out.println("Enter the data");
                int data=scanner.nextInt();
                sListIterator.delete(sList,sList.head,data);
            }
        }
            System.out.println(sList);
    }
}

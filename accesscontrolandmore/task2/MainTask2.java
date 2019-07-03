package accesscontrolandmore.task2;

public class MainTask2 {
    public static void main(String args[])
    {
        Cycle[] cycle=new Cycle[3];
        Bicycle bicycle=new Bicycle();
        Unicycle unicycle=new Unicycle();
        Tricycle tricycle=new Tricycle();

        //cycle[0]=(Cycle)bicycle;
       // cycle[0].balance(); Upcasting doesn't work
        cycle[0]=new Bicycle();
        cycle[1]=new Unicycle();
        cycle[2]=new Tricycle();
        bicycle=(Bicycle)cycle[0];
        bicycle.balance();
        unicycle=(Unicycle)cycle[1];
        unicycle.balance();
        tricycle=(Tricycle)cycle[2];
    //    tricycle.balance(); No balance method in Tricycle
    }
}

package accesscontrolandmore.task4;

public class UnicycleFactory implements CycleFactory{
    public Cycle getType()
    {
        return new Unicycle();
    }
}

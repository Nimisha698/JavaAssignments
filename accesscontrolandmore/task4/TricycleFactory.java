package accesscontrolandmore.task4;

public class TricycleFactory implements CycleFactory {
    public Cycle getType()
    {
        return new Tricycle();
    }
}

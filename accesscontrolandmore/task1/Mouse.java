package accesscontrolandmore.task1;

public class Mouse extends Rodent {
    public Mouse()
    {
        System.out.println("Class Mouse called");
    }
    @Override
    public void rodentsBite()
    {
        System.out.println("Mice bite!");
    }
}

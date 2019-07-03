package accesscontrolandmore.task1;

public class Hamster extends Rodent {
    public Hamster()
    {
        System.out.println("Class hamster called");
    }

    @Override
    public void rodentsBite() {
        System.out.println("Hamsters don't bite");
    }
}

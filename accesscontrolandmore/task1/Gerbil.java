package accesscontrolandmore.task1;

import accesscontrolandmore.task1.Rodent;

public class Gerbil extends Rodent {
    public Gerbil()
    {
        System.out.println("Class Gerbil called");
    }

    @Override
    public void rodentsBite() {
        System.out.println("Gerbils bite");
    }
}

package accesscontrolandmore.task3;

public class FactoryProcess extends ConcreteClass implements inheritedInterface {
    public void methodOfInheritedInterface()
    {

    }

    @Override
    public void milk() {
        System.out.println("Milk");
    }

    @Override
    public void cocoa() {
        System.out.println("Cocoa");
    }

    @Override
    public void mix() {
        System.out.println("Elements mixed");

    }

    @Override
    public void set() {
        System.out.println("Elements set");
    }

    @Override
    public void test() {
        System.out.println("Testing");
    }

    @Override
    public void supply() {
        System.out.println("Supplied");
    }
}


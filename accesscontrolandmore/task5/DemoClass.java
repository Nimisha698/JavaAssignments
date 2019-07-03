package accesscontrolandmore.task5;

public class DemoClass {
    public DemoClass()
    {
        System.out.println("DemoClass constructor");
    }
    public static class NoDefaultConstructor
    {
        int parameter;
        NoDefaultConstructor(int parameter)
        {
            this.parameter=parameter;
            System.out.println("Not default Constructor");
        }
    }
}

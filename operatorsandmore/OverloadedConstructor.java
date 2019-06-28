package operatorsandmore;

public class OverloadedConstructor {
    String string;
    int number;
    public OverloadedConstructor(String string,int number)
    {
        this(string);
        System.out.println("first constructor");
    }
    public OverloadedConstructor(String string)
    {
        this.string=string;
        this.number=number;
        System.out.println("second constructor");
    }
    public static void main(String args[])
    {
        OverloadedConstructor overloadedConstructor=new OverloadedConstructor("string",1);

    }
}

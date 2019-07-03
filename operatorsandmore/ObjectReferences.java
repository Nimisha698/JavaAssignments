package operatorsandmore;

public class ObjectReferences
{
    ObjectReferences(String string)
    {
        System.out.println(string);
    }
    public static void main(String args[])
    {
        ObjectReferences[] arrayOfReferences=new ObjectReferences[10];
        arrayOfReferences[0]=new ObjectReferences("string");
        arrayOfReferences[1]=new ObjectReferences("string");
    }
}

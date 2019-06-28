package nimisha.assignment.singleton;

public class StaticMemberVariables {
    private String string;
    public static StaticMemberVariables stringIntialisation(String stringParam)
    {
       // stringParam=string;
        // Non static member 'string' declared on line 4 cannot be referenced from static context
        return new StaticMemberVariables();
    }
    public void printString()
    {
        System.out.println(string);
    }

}

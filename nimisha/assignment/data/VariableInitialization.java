package nimisha.assignment.data;

public class VariableInitialization {
    private int classInt;
    private char classChar;
    public void printClassVariables()
    {
        System.out.println("Class int variable "+classInt);
        System.out.println("Class char variable "+classChar);
    }
    public void printLocalVariables()
    {
        int localInt;
        int localChar;
       // System.out.println("Local int variable "+localInt);
       // System.out.println("Local char variable "  +localChar);
        // Not allowed because local variables do not get initial values assigned by default
    }
    public static void main(String args[])
    {
        VariableInitialization variables=new VariableInitialization();
        variables.printClassVariables();
        variables.printLocalVariables();
    }
}

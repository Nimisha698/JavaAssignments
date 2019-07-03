package errorhandling;

public class Main {
    public static  void main(String args[])
    {
        CustomExceptions customExceptions=new CustomExceptions();
        try {
            customExceptions.Exceptions();
        }
        catch(Exception e)
        {
            System.out.println("Exception caught");
        }
        finally {
            System.out.println("finally executed");
        }
    }
}

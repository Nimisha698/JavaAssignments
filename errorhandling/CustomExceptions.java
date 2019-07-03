package errorhandling;

public class CustomExceptions
{
    public void Exceptions() throws MyExceptionType1,MyExceptionType3,MyExceptionType2
    {
        throw new MyExceptionType1("exception1");
    }
}
package nimisha.assignment.main;

import nimisha.assignment.data.VariableInitialization;
import nimisha.assignment.singleton.StaticMemberVariables;

public class Main {
    public static void main(String args[])
    {
        VariableInitialization variableObj=new VariableInitialization();
        variableObj.printClassVariables();
        variableObj.printLocalVariables();

        StaticMemberVariables staticObj=new StaticMemberVariables();
        staticObj.printString();
    }
}

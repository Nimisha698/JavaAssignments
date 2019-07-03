package accesscontrolandmore.task5;

public class InheritedFromDemo {

    public static class InnerClass extends DemoClass.NoDefaultConstructor {
        public InnerClass(int number) {
            super(number);
        }
    }
}
package OOP.Inheritance;

public class ObjectInitilizationOrder {
    public static void main(String[] args) {
        Parent p = new ChildClass();
        System.out.println("=====================");
        p = new ChildClass();
    }

}
class Parent {
    static {
        System.out.println("Static init block parent");
    }

    {
        System.out.println("Init block parent");
    }

    public Parent() {
        System.out.println("Parent constructor");
    }

}

class ChildClass extends Parent {
    static {
        System.out.println("Static init block child");
    }

    {
        System.out.println("Init block child");
    }

    public ChildClass() {
        System.out.println("child constructor");
    }
}
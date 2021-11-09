package OOP.Encapsulation.Package2;

import OOP.Encapsulation.Package1.ClassA;

public class ClassB extends ClassA {
    void doSomething3(){
        doSomething2();
        withinsameCLass();
    }
    private void withinsameCLass(){
        System.out.println("Accessed within class only");
    }
}

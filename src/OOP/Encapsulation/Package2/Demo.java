package OOP.Encapsulation.Package2;

import OOP.Encapsulation.Package1.ClassA;

public class Demo {
    public static void main(String[] args) {
        ClassA classA = new ClassA(); //public modifier
        classA.doSomething();
//        classA.doSomething2(); //different package cant access protected method

        ClassB classB=new ClassB();
        classB.doSomething3(); //Default modifier can be accessed within the package
//        classB.withinsameClass(); //private method of class b
    }
}

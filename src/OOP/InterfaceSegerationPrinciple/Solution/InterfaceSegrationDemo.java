package OOP.InterfaceSegerationPrinciple.Solution;

public class InterfaceSegrationDemo {
    public static void main(String[] args) {
        Flyable flyable = new Plane();
        flyable.fly();
        Drivable plane = new Plane();
        plane.drive();


        Drivable drivable= new Car();
        drivable.drive();

    }
}

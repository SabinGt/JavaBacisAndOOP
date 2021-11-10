package OOP.InterfaceSegerationPrinciple.Problem;

public class InterfaceSegrationDemo {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle plane = new Plane();

        car.drive();
        plane.fly();
        car.fly();
    }
}

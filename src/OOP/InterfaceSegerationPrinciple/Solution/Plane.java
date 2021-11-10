package OOP.InterfaceSegerationPrinciple.Solution;

public class Plane implements Flyable,Drivable {
    @Override
    public void fly() {
        System.out.println("Plane can fly");
    }

    @Override
    public void drive() {
        System.out.println("Plane can Drive too");
    }
}

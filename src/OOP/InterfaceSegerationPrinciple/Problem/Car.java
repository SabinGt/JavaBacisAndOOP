package OOP.InterfaceSegerationPrinciple.Problem;

public class Car implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Car can drive");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException();

    }
}

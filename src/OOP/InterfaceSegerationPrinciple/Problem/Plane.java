package OOP.InterfaceSegerationPrinciple.Problem;

public class Plane implements Vehicle{
    @Override
    public void drive() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void fly() {
        System.out.println("Plane Can fly");
    }
}

package OOP.LISKOVsubstitutionPrincipleDemo.Solution;

public class LiskovSubistitutionPrincipleDemo {
    public static void main(String[] args) {
        FlyingBirds[] flyingBirds = new FlyingBirds[] {new Crow(),new Sparrow()};
        for (FlyingBirds bird: flyingBirds){
            bird.fly();
        }
        System.out.println("\n============\n");
        EatingBirds[] eatingBirds = new EatingBirds[]{new Crow(), new Sparrow(),new Ostrich()};
        for(EatingBirds bird: eatingBirds){
            bird.eat();
        }

    }
}

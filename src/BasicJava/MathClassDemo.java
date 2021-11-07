package BasicJava;

public class MathClassDemo {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.max(3,5));
        System.out.println(Math.min(3,5));
        System.out.println(Math.sqrt(4));
        System.out.println(Math.E);
        System.out.println(Math.round(3.12245));
        System.out.println(Math.abs(-5));
        System.out.println(5/0.0);
        System.out.println(-5/0.0);
        System.out.println(0/0.0);
        System.out.println(Math.sqrt(-1.0));

        //Random
        System.out.println(Math.random()); //random number between 0 and 1
        System.out.println((int)(Math.random()* 100)); //between 0 and 100
        System.out.println((int)(Math.random()*100 + 100)); //between 100 and 200
    }
}

package BasicJava;

public class VaringArguments {
    public static void main(String... args) {
        System.out.println(sum(1, 2, 3, 4, 5));
        System.out.println(sum(5));
    }


    private static int sum(int... ints) {
        int sum = 0;
        for (int i : ints) {
            sum += i;
        }
        return sum;
    }



}

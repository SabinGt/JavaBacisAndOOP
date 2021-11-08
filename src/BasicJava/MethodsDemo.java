package BasicJava;

public class MethodsDemo {
    public static void main(String[] args) {
        int res = sum(1, 3);
        printToConsole(res);
        double result = sum(3.1,4.5);
        printToConsole(result);
        printToConsole("Some text");
    }
    private static int sum(int i1, int i2) {
        return i1 + i2;

    }

    private static double sum(double d1, double d2) {
        return d1 + d2;
    }

    private static void printToConsole(String text) {
        System.out.println(text);
    }

    private static void printToConsole(int i) {
        System.out.println(i);
    }

    private static void printToConsole(double d) {
        System.out.println(d);
    }



    }



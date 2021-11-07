package BasicJava;

import java.util.Scanner;

public class ReadFromConsole {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word");
        String word = sc.next();
        System.out.println("the word you entered" + " " + word);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        System.out.println("the number you entered" + " " + num);

    }
}

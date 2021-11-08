package BasicJava;

import java.util.Scanner;

public class IfStatementExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the amount you have on your card");
        int cardAmount = sc.nextInt();
        System.out.println("Please enter the amount of item you are purchasing");
        int itemAmount = sc.nextInt();
        if (cardAmount< itemAmount)
            System.out.println("Not enough money to purchase item");
        else
            System.out.println("You can purchase the item");

    }

}

package BasicJava;

import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your plan");
        System.out.println("Guest====Normal=====Silver====Gold");
        String user = sc.next();
        switch (user)
        {
            case "Guest":
                System.out.println("Please purchase other plan to get more services");
                break;
            case "Normal":
                System.out.println("You have limited access to the resources");
                break;
            case "Silver":
                System.out.println("Congratulation!! you are one step near to our VIP membership");
                break;
            case "Gold":
                System.out.println("Thakyou for being our VIP member");
                break;
            default:
                System.out.println("The more the merrier ");

        }
    }
}

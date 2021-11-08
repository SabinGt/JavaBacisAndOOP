package BasicJava;

import java.sql.Array;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class IterationStatementDemo {
    public static void main(String[] args) {
        //While loop
        int i = 0;
        while(i<10){
            System.out.println(i);
            i++;

        }
        //infinite loop
//        while(true){}

        //do while loop
        System.out.println("Output of do while ");
        do {
            System.out.println(i);
            i++;
        }while (i<15);

        //for loop
        System.out.println("====Output of for loop=====");
        for (int j =0; j< 10 ; j++){
            System.out.println(j);
        }
        //infinite loop
//        for(;;){ }

        //for each loop
        int[] arr = {1,2,3,4,5};
        int sum = 0;
        for (int number: arr) {
            sum += number;
            System.out.println("Number: " + number);
        }
        System.out.println("Sum: " + sum);

        //nested loop
//        int[][] array= new int[3][2];
//        //inserting value in multidimensional array
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter six values to be inserted on array");
//        for(int k = 0; k<3 ; k++){
//            for (int l = 0; l<2 ; l++){
//                array[k][l] = sc.nextInt();
//            }
//            System.out.println();
//        }
//        System.out.println("Output of the array");
//        for(int k = 0; k<3 ; k++){
//            for (int l = 0; l<2 ; l++){
//                System.out.println(array[k][l] + " ");
//            }
//            System.out.println();
//        }
        System.out.println("=========== continue");
        for (int m = 0; m < 5; m++) {
            if (m % 2 == 0) {
                continue;
            }
            System.out.println("counter: " + m);
        }

        System.out.println("=========== break");
        for (int n = 0; n < 5; n++) {
            if (n == 3) {
                break;
            }
            System.out.println("counter: " + n);
        }

        System.out.println("=========== break nested loop");
        for (int a = 0; a< 5; a++) {
            for (int b= 0; b < 5; b++) {
                if (b == 3) {
                    break;
                }
                System.out.print(b + " ");
            }

            System.out.println("counter: " + a);
        }

        //matrix
        int[][] matrix ={
                {1,2,3,4},
                {4,5},
                {7,8,9}

        };
        //displaying
        for(int x = 0; x<matrix.length;x++){
            for(int y = 0 ; y<matrix[x].length;y++){
                System.out.println(matrix[x][y] + "\t");
            }
            System.out.println();
        }



    }

}

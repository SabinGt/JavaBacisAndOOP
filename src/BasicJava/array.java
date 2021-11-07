package BasicJava;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0]=1;
        System.out.println(arr[0]);
        
        int[] arr1 ={5,4,3};
        System.out.println("The length of array is"+ " "+arr1.length);
        System.out.println("The elements of array"+" "+ Arrays.toString(arr1));
        //sorting array
        Arrays.sort(arr1);
        System.out.println("The elements of array after sorting"+" "+ Arrays.toString(arr1));
        /*
        loop in array
         */
        for (int i = 0; i< arr1.length;i++){
            System.out.println(arr1[i]);
        }

        /*
        multi-dimensional array
         */
        int[][] matrix={
                {1,2,3},
                {4,5,6}
        };
        /*
       for loop in 2D array
         */
        for (int j=0; j<matrix.length; j++){
            for (int k =0; k<matrix[j].length;k++){
                System.out.print(matrix[j][k]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }

    }
}

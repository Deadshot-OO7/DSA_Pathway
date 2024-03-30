package One_D_Arrays;

import java.util.Scanner;
//Write a program to take in 10 values and print only those nos which are prime.
public class array_of_prime_numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            int j = 2;
            boolean isNotPrime = false;
            while( j < arr[i]){
                if(arr[i] % j == 0) {
                    isNotPrime = true;
                    break;
                }
                else
                    j++;
            }

            if(!isNotPrime)
                System.out.println(arr[i]);
        }


    }
}

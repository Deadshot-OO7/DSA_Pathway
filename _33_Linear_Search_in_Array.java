package DSA_Revision;

import java.util.Scanner;

public class _33_Linear_Search_in_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many number do you want insert");

        int size = sc.nextInt();

        int[] search = new int[size];

        System.out.println("Enter the numbers");

        for (int i = 0; i < size; i++) { 
            search[i] = sc.nextInt();
        }

        System.out.println("Element to find its index");
        int n = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if (n == search[i])
                System.out.println("The index is :- " + i);
        }

    }
}

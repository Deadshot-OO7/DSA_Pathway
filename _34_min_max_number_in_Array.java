package DSA_Revision;

import java.util.Scanner;

public class _34_min_max_number_in_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number you want to insert : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the numbers : ");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }


        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < size; i++) {
            if(arr[i]>max)
                max = arr[i];

            if(arr[i]<min)
                min = arr[i];

        }

        System.out.println("The min and max are resp - " + min + " and " + max);

    }
}

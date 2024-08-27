package DSA_Revision;

import java.util.Scanner;

public class _35_is_Array_Sorted {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : - ");

        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isSorted = true;

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i+1]<arr[i]) {
                isSorted = false;
                break;
            }
        }

        if(isSorted){
            System.out.println("Array is in ascending order");
        }
        else
            System.out.println("Array is not sorted");

    }
}

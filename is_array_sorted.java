package One_D_Arrays;

import java.util.Scanner;

public class is_array_sorted {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        boolean isSorted = true;

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1])
                isSorted = false;
        }

        if(!isSorted)
            System.out.println("Array is not sorted");
        else
            System.out.println("Array is sorted");
    }
}

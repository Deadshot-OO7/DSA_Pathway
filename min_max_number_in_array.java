package One_D_Arrays;

import java.util.Scanner;
//Find the maximum & minimum number in an array of integers.
public class min_max_number_in_array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();

        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if(min>arr[i]) min = arr[i];
            if(max<arr[i]) max = arr[i];

        }
        System.out.println(min);
        System.out.println(max);
    }
}

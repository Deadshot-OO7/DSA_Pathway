package One_D_Arrays;

import java.util.Scanner;

public class printing_array_in_3_cols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];

        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
        }
        int index = 0;
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[index]+"\t");
                index++;
            }
            System.out.println();
        }
    }
}

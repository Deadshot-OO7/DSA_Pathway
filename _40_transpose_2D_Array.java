package Two_D_Arrays;

import java.util.Scanner;

public class _40_transpose_2D_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] arr = {{1,5,7,9,10,11},{6,10,12,13,20,21},{9,25,29,30,32,41}};
        int rows = arr.length;
        int cols = arr[0].length;

        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i]=arr[i][j];
            }
        }

        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}

package Two_D_Arrays;

import java.util.Scanner;

public class spiral_printing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you want - ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns you want - ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];    // array declaration

        System.out.println("Enter the Elements for the 2-D Arrays");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The 2-D looks like - ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println();

        int row_start = 0,row_end = rows-1, column_start=0, column_end=cols-1;

        while (row_start <= row_end && column_start <= column_end){

            for (int i = row_start; i <= row_start ; i++) {
                for (int j = column_start; j <= column_end ; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();

            row_start++;

            for (int i = column_end; i <= column_end ; i++) {
                for (int j = row_start  ; j <= row_end ; j++) {
                    System.out.print(arr[j][i] + " ");
                }
            }
            System.out.println();

            column_end--;

            for (int i = row_end; i <= row_end ; i++) {
                for (int j = column_end; j >= column_start ; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();

            row_end--;

            for (int i = column_start; i <= column_start ; i++) {
                for (int j = row_end; j >= row_start ; j--) {
                    System.out.print(arr[j][i] + " ");
                }
            }
            column_start++;
            System.out.println();
        }
    }
}

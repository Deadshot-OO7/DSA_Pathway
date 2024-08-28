package DSA_Revision;

import java.util.Scanner;

public class _39_Spiral_Order_Matrix {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int[][] arr = {{1,5,7,9,10,11},{6,10,12,13,20,21},{9,25,29,30,32,41}};
        int rows = arr.length;  // 3
        int cols = arr[0].length;  // 6

        int row_start = 0;
        int row_end = rows-1; //2
        int col_start = 0;//1
        int col_end = cols-1; //3

        while(row_start <= row_end && col_start < col_end){

            for (int j = col_start; j <= col_end ; j++) {
                System.out.println(arr[row_start][j]);
            }

            row_start++;

            for (int i = row_start; i <= row_end ; i++) {
                System.out.println(arr[i][col_end]);
            }

            col_end--;

            for (int j = col_end; j>=col_start ; j--) {
                System.out.println(arr[row_end][j]);
            }

            row_end--;

            for (int i = row_end ; i >=row_start; i--) {
                System.out.println(arr[i][col_start]);
            }

            col_start++;
        }


    }
}

package Two_D_Arrays;

import java.util.Scanner;

public class Accepting_Array {
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
    }
}

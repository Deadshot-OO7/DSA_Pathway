package Two_D_Arrays;

import java.util.Scanner;

public class search_in_two_D_Array {
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

        System.out.println("Enter the number you want to search in 2-D array - ");
        int num = sc.nextInt();

        boolean flag = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == num) {
                    System.out.println("The indices of the searched element is - " + i + " " + j);
                    flag = true;
                }
            }
            System.out.println();
        }
        if(!flag)
            System.out.println("Element not found!");
    }

}

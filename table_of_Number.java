package Loops_in_Java;

import java.util.Scanner;

public class table_of_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number for the table - ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(n*i);

        }
    }
}

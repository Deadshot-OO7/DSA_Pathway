package Loops_in_Java;

import java.util.Scanner;

public class sumFirstN_number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Give a number");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println(("The sum of first n number is - " + sum));

    }
}

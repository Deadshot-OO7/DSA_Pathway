package Loops_in_Java;

import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number :- ");
        int n = sc.nextInt();
        boolean isNotPrime = false;
        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                isNotPrime = true;
                break;
            }
        }

        if(isNotPrime) System.out.println( n + " is not a prime number");
        else System.out.println( n + " is a prime number");
    }
}

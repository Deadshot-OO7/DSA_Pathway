package Loops_in_Java;

import java.util.Scanner;

public class Looping_hello_by_For {
    public static void main(String[] args) {
        System.out.println("This is a Program of looping a string");
        Scanner scanner = new Scanner(System.in);

        System.out.print("What you want to loop, type a word here - ");
        String userInput = scanner.next();

        System.out.print("\n How many times do you want to run the loop - ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(userInput);
        }
    }
}

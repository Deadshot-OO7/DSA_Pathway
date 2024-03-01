package CodingChallenge;

import java.util.Scanner;

public class challenge2_Q1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String userName = scanner.nextLine();
        System.out.println("Your name is " + userName);

        System.out.println("\nWhat is your age?");
        int userAge = scanner.nextInt();
        System.out.println("So your age is " + userAge);

        //It prints “You’ve lived x years. In another x years you’ll be 2x years old.”, where x is their age.

        System.out.format("\nYou have lived %d years. In another %d years you’ll be %d years old", userAge,userAge,2*userAge);

        System.out.println("\nThe length of your name is - " + userName.length());
    }
}

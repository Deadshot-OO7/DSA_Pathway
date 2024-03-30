package PracticeQuestions;

import java.util.Scanner;
import java.util.StringTokenizer;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name");
        String userName = scanner.next();
        System.out.println(userName + " is a nice name.\n");

        System.out.println("What is your age, " + userName);
        int userAge = scanner.nextInt();
        System.out.println(userName + ", you are " + userAge + " years old\n");

        System.out.println("What is your height in feet, " + userName);
        double userHeight = scanner.nextDouble();
        System.out.println("Your height is " + userHeight + " feet tall");
    }
}

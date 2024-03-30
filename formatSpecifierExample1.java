package PracticeQuestions;

import java.util.Scanner;

public class formatSpecifierExample1 {
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

        System.out.format("%.2fm, if you are male then the difference between your height and average height.\n", userHeight - 1.75);
        System.out.format("%.2fm, if you are female then the difference between your height and average height.", userHeight - 1.68);

    }
}

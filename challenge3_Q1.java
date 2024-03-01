package CodingChallenge;

import java.util.Random;
import java.util.Scanner;

public class challenge3_Q1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println(("Pick a random number between 1 to 5"));
        int userNumber = scanner.nextInt();

        int compRandomNum = random.nextInt(1,6);
        System.out.println("\nComputer chosen number is : " + compRandomNum);
        if(userNumber == compRandomNum){
            System.out.println("\nCorrect! Aren’t you lucky.");
        }else{
            System.out.println("\nHard luck! Maybe next time.“");
        }
    }
}

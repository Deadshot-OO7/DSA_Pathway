package CodingChallenge;

import java.util.Random;
import java.util.Scanner;

public class guessNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner((System.in));
        Random rand = new Random();

        int randomNumber = rand.nextInt(1, 101);
        System.out.println("System has chosen the number, Now its time to choose your number");

        while (true){
            System.out.print("Guess number :- ");
            int guess = sc.nextInt();

            if(guess>randomNumber) System.out.println("Go Lower");
            else if (guess < randomNumber) {
                System.out.println("Go Higher");
            }
            else{
                System.out.println("you Guessed it correct");
                break;
            }
        }
    }
}

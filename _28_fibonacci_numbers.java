package DSA_Revision;

import java.util.Scanner;

public class _28_fibonacci_numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;
        //0 1

        for (int i = 1; i <=n ; i++) {
            System.out.print(firstTerm + " ");

            int sum = firstTerm +secondTerm;
            firstTerm = secondTerm;
            secondTerm = sum;


        }

        //second way is to use recursive approach.
    }
}

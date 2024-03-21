package methods_and_functions;

import java.util.Scanner;

//Write a program to enter the numbers
// till the user wants and at the end it should display the count of positive, negative and zeros entered.
public class ques1 {
    static int pos = 0;
    static int neg = 0;
    static int zeros = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers you want to insert :- ");
        int totalNum = sc.nextInt();
        System.out.print("Enter the numbers");

        for (int i = 0; i < totalNum; i++) {
            int a = sc.nextInt();
            calculator(a);

        }

        System.out.println("Positive numbers :- " + pos);
        System.out.println("Negative numbers :- " + neg);
        System.out.println("zeros numbers :- " + zeros);

    }

    public static void calculator(int a){
        if(a>0) pos++;
        else if (a<0) neg++;
        else zeros++;
    }
}

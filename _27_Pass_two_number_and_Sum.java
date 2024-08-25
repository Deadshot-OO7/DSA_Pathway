package DSA_Revision;

import java.util.Scanner;

public class _27_Pass_two_number_and_Sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers for sum :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The sum is " + getSum(a,b));
    }

    public static int getSum(int a, int b){
        return a+b;
    }
}

package DSA_Revision;

import java.util.Scanner;

public class _29_fibonacci_recursive {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        int n = sc.nextInt();

        System.out.print(getFibonacci(n-1));

    }

    public static int getFibonacci(int n){
        if(n<=1)
            return n;

        return getFibonacci(n-1) + getFibonacci(n-2);
    }
}

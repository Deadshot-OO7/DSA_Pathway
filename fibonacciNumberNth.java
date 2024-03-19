//Write a program to print Fibonacci series of n terms where n is input by user :
//0 1 1 2 3 5 8 13 21 .....
package methods_and_functions;

import java.util.Scanner;

public class fibonacciNumberNth {
    public static void main(String[] args) {

        Scanner sc = new Scanner((System.in));

        System.out.println("Enter the nth number");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(fibo(i));

        }
        fibo(n);
    }

    public static int fibo(int n){
        if( n == 1){
            return  0;
        }
        else if( n == 2) {
            return 1;
        }
       return fibo(n-1)+fibo(n-2);

    }
}

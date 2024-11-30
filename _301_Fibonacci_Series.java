package Recursion;

public class _301_Fibonacci_Series {
    public static void main(String[] args) {
        int n = 2;

        System.out.println(fibo(n));

    }

    public static int fibo(int n){
        if(n == 1 || n == 2)
            return n-1;

        return fibo(n-1) + fibo( n - 2);
    }
}

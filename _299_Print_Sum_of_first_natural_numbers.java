package Recursion;

public class _299_Print_Sum_of_first_natural_numbers {
    public static void main(String[] args) {
        int n = 4;

        System.out.println(printSum(n));

    }

    public static int printSum( int n ){
        if(n == 1)
            return 1;

        return n + printSum(--n);
    }
}

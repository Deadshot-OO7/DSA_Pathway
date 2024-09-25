package Bitwise_Operators;

public class _186_Turnoff_the_rightmost_set_bit {
    public static void main(String[] args) {
        int n = 18; //
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(n-1 ));
        System.out.println( n & (n-1));
    }
}

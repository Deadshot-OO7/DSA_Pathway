package Bitwise_Operators;

public class _174_Clear_a_particular_bit_at_given_Pos {
    public static void main(String[] args) {
        int n = 75;
        int pos = 5;

        int bitmask = 1 << (pos-1);
        System.out.println(Integer.toBinaryString(n));
        System.out.println(n & ~bitmask);
    }
}

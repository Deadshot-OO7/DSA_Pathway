package Bitwise_Operators;

public class _183_Clear_all_bits_from_the_least_significant_bit_LSB__to_the_ith_bit {
    public static void main(String[] args) {
        int n = 91;
        int pos = 4;

        int mask = ~((1 << pos)-1);

        System.out.println(Integer.toBinaryString(n&mask));
    }
}

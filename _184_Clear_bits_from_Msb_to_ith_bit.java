package Bitwise_Operators;

public class _184_Clear_bits_from_Msb_to_ith_bit {
    public static void main(String[] args) {
        int n = 90;//101100000011
        int pos = 4;
        System.out.println(Integer.toBinaryString(n));
        int mask = ((1 << Integer.toBinaryString(n).length()-pos)-1);

        System.out.println(n & mask);
    }
}

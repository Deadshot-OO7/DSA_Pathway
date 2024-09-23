package Bitwise_Operators;

import javax.swing.plaf.IconUIResource;

public class _179_Count_the_number_of_bits_needed_to_be_flipped {
    public static void main(String[] args) {
        int n = 145;
        int m = 97;

        System.out.println((Integer.bitCount(n^m)));

    }
}

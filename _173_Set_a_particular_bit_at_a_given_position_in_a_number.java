package Bitwise_Operators;

public class _173_Set_a_particular_bit_at_a_given_position_in_a_number {
    public static void main(String[] args) {

        int n = 75;
        int pos = 5;

        System.out.println(Integer.toBinaryString(n));

        int bitmask = 1 << 4;

        System.out.println( n | bitmask);
    }
}

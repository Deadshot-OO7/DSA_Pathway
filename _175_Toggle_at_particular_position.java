package Bitwise_Operators;

public class _175_Toggle_at_particular_position {
    public static void main(String[] args) {
        int n = 1;
        int pos = 4;

        System.out.println(Integer.toBinaryString(n));
        int bitmask = 1 << (pos-1);

        System.out.println(n ^ bitmask);

    }
}

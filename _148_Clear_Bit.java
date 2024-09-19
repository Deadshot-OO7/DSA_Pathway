package Bitwise_Operators;

public class _148_Clear_Bit {
    public static void main(String[] args) {

        int n = 5;
        int pos = 2;

        int bitmask = 1 << pos; //0100
        int notBitMask = ~bitmask;  // BITWISE NOT OPERATOR
        int newNum = n & notBitMask;

        System.out.println(newNum);

    }
}

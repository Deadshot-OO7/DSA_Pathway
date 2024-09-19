package Bitwise_Operators;

public class _149_Update_Bit {
    public static void main(String[] args) {

        int n = 5; //0101
        int pos = 1;

        //Setting bit to 1

        int bitMask = 1 << pos;

        int newNum = bitMask | n;
        System.out.println(newNum);

        //Setting bit to 0
        bitMask = 1 << 2;
        int notBitmask = ~bitMask;

        System.out.println(n & notBitmask);


    }
}

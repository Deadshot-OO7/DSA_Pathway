package Bitwise_Operators;

public class _146_Get_Bit {
    public static void main(String[] args) {

        int n = 5; //0101
        int pos = 2;

        int bitMask = 1 << pos; //0001 << 2 --> 0100

        if( (bitMask & n) == 0){    // 0100 & 0101 ==> 0100 which is non-zero
            System.out.println("Bit is zero");
        }else {
            System.out.println("Bit is one");
        }

    }
}

package Bitwise_Operators;

import java.util.Scanner;

public class _147_Set_Bit {
    public static void main(String[] args) {

        int n = 5; // 0101
        int pos = 1;
        int bitmask = 1 << pos; //0001 << 2 ==> 0100

        System.out.println(bitmask | n);
    }
}

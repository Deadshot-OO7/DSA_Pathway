package Bitwise_Operators;

import java.util.ArrayList;

public class _168_Reverse_the_32_Bits_unsigned_Integer {
    public static void main(String[] args){
        int n = 43261596;

        ArrayList< Integer> list = new ArrayList<>();

        while(n>0){
            list.add(n%2);
            n/=2;
        }

        System.out.println(list);

    }
}

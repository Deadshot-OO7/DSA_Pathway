package Bitwise_Operators;

import java.util.ArrayList;

public class _153_decimal_To_Binary_representation {
    public static void main(String[] args) {
        int n = 19;

        ArrayList<Integer> list = new ArrayList<>();

        while(n>=1){
            list.add(n%2);
            n/=2;
        }
        System.out.println(list.reversed());
    }
}

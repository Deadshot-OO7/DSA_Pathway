package Bitwise_Operators;

import java.util.ArrayList;
import java.util.Collections;

public class _165_Power_of_Four_Using_Bit_manipulation {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        int n = 64;

        if(Integer.bitCount(n)!=1 || n<=0)
            System.out.println(false);

        while(n>0) {
            list.add(n % 2);
            n /= 2;
        }

        int itr = 0;
//        Collections.reverse(list);

        for(int i = list.size()-1; i>=0; i--){
            if(list.get(i)==1 && itr%2==0)
                System.out.print(true);
            itr++;
        }

    }
}

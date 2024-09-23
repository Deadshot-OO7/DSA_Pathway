package Bitwise_Operators;

import java.util.ArrayList;

public class _166_Binary_Number_with_Alternating_Bits {
    public static boolean main(String[] args){
        int n = 5; // 0101

        ArrayList <Integer> list = new ArrayList<>();

        if(n==1)
            return true;

        while(n>0){
            list.add(n%2);
            n/=2;
        }

        for(int i = 0; i<list.size()-1;i++){
            if(list.get(i)==list.get(i+1))
                return false;
        }

        return true;
    }
}

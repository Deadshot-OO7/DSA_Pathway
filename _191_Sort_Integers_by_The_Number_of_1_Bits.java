package Bitwise_Operators;

import java.util.ArrayList;
import java.util.Arrays;

public class _191_Sort_Integers_by_The_Number_of_1_Bits {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8};

        Arrays.sort(arr);
        int maxOneBits = 0;

        for (int i = 0; i < arr.length; i++) {
            if(Integer.bitCount(arr[i])>maxOneBits)
                maxOneBits=Integer.bitCount(arr[i]);
        }

        int[] res= new int[arr.length];
        int itr = 0;

        for (int j = 0; j <= maxOneBits; j++) {
            for (int k = 0; k < arr.length; k++) {
                if(Integer.bitCount(arr[k])==j){
                    res[itr++]=arr[k];
                }
            }
        }

        System.out.println(res);


    }
}

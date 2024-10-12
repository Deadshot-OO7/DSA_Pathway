package Sorting;

import java.util.Arrays;
import java.util.HashMap;

public class _232_Rank_Transform_of_an_Array_Using_HashMap {
    public static void main(String[] args) {
        int[] arr = {37,12,28,9,100,56,80,5,12};
        int[] sorted = arr.clone();
        int[] res = new int[arr.length];

        Arrays.sort(sorted);
        HashMap<Integer,Integer> hm = new HashMap<>();

        int rank = 0;
        for(int n : sorted){
            if(!hm.containsKey(n))
                hm.put(n,++rank);
        }

        for (int i = 0; i < arr.length; i++) {
            res[i] = hm.get(arr[i]);
        }


    }
}

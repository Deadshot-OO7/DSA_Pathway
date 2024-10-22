package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _246_Minimum_Absolute_Difference {
    public static void main(String[] args) {
        int[] arr = {40,11,26,27,-20};
        List<List<Integer>> listOfLists = new ArrayList<>();
        Arrays.sort(arr);

        for (int n : arr)
            System.out.print(n + " ");

        int minDiff = Integer.MAX_VALUE;
        int diff = 0;
        for (int i = 0; i < arr.length-1; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            diff = arr[i+1]-arr[i];
            if(diff==minDiff){
                minDiff = diff;
                list.add(arr[i]);
                list.add(arr[i+1]);
                listOfLists.add(list);
            } else if (diff < minDiff) {
                minDiff = diff;
                listOfLists.clear();
                list.add(arr[i]);
                list.add(arr[i+1]);
                listOfLists.add(list);
            }
        }

        System.out.println(listOfLists);

    }
}

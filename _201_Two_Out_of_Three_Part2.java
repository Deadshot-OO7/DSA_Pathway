package Bitwise_Operators;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class _201_Two_Out_of_Three_Part2 {
    public static void main(String[] args) {
        int[] nums1 = {1,1,3,2};
        int[] nums2 = {2,3};
        int[] nums3 = {3};

        int[] arr1 = new int[101];
        int[] arr2 = new int[101];
        int[] arr3 = new int[101];

        for (int n : nums1)
            arr1[n]++;

        for (int n : nums2)
            arr2[n]++;

        for (int n : nums3)
            arr3[n]++;

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            int count = 0;

            if(arr1[i]>0)
                count++;

            if(arr2[i]>0)
                count++;

            if(arr3[i]>0)
                count++;

            if(count>=2)
                list.add(i);
        }

        System.out.println(list);


    }
}

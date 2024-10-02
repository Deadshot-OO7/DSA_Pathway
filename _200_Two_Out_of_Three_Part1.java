package Bitwise_Operators;

import java.util.*;

public class _200_Two_Out_of_Three_Part1 {
    public static void main(String[] args) {
        int[] nums1 = {1,1,3,2};
        int[] nums2 = {2,3};
        int[] nums3 = {3};
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int num : nums2) {
            set2.add(num);
        }

        Set<Integer> set3 = new HashSet<>();
        for (int num : nums3) {
            set3.add(num);
        }

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int n : set1){
            list1.add(n);
        }

        for(int n : set2){
            if(list1.contains(n))
                list2.add(n);
            else
                list1.add(n);
        }

        for(int n : set3){
            if(list1.contains(n) && !list2.contains(n))
                list2.add(n);
            else
                list1.add(n);
        }

//        return list2;

        System.out.println(list2);
    }
}

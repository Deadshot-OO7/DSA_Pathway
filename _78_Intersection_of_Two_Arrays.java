package Two_D_Arrays;

import java.util.HashSet;
/*
* Given two integer arrays nums1 and nums2, return an array of their
intersection
. Each element in the result must be unique and you may return the result in any order.



Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
* */
public class _78_Intersection_of_Two_Arrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();

        for(int n : nums1){
            set.add(n);
        }

        for(int n : nums2){
            if(set.contains(n))
                set1.add(n);
        }

        int[] A = new int[set1.size()];
        int itr = 0;
        for(int n : set1){
            A[itr++]=n;
        }

        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }
}

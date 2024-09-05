package Two_D_Arrays;
/*
* Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.



Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.
*
* Input: nums1 = [1,2], nums2 = [2,1]
Output: [1,2]
* */
import java.util.HashSet;
import java.util.LinkedList;

public class _79_Intersection_of_Two_Arrays_II {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < nums1.length; i++) {

            for (int j = 0; j < nums2.length; j++) {
                if(nums1[i] == nums2[j]){
                    list.add(nums1[i]);
                    nums2[j] = -1;
                    break;
                }
            }

        }
        System.out.println(list);
    }
}

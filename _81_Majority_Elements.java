package Two_D_Arrays;
import java.util.ArrayList;
import java.util.Collections;
/*
* Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.



Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
* */


public class _81_Majority_Elements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

    int[]  nums = {2,2,1,1,1,2,2};
    int half = nums.length/2;
    int count = 0;
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }

        Collections.sort(list);

        System.out.println(list.get(nums.length/2));
    }
}

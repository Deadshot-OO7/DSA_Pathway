package Two_D_Arrays;

import java.util.HashSet;
/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1


* */
public class _77_Single_Number {
    public static void main(String[] args) {
        HashSet<Integer> nonRepitiveSet = new HashSet<>();
        HashSet<Integer> repitiveSet = new HashSet<>();
        int[] nums = {2,2,1};
        int ret = nums[0];
        int[] A = new int[nums.length];
        for(int i = 0 ; i< nums.length; i++){
            if(!nonRepitiveSet.contains(nums[i]))
                nonRepitiveSet.add(nums[i]);
            else{
                repitiveSet.add(nums[i]);
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(!repitiveSet.contains(nums[i]))
                ret = nums[i];
        }
        System.out.println(ret);
    }
}

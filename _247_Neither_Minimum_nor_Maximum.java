package Sorting;

import java.util.Arrays;
/*
Given an integer array nums containing distinct positive integers, find and return any number from the array that is neither the minimum nor the maximum value in the array, or -1 if there is no such number.

Return the selected integer.*/
public class _247_Neither_Minimum_nor_Maximum {
    public static int main(String[] args) {
        int[] nums = {3,2,1,4};
        Arrays.sort(nums);

        return nums.length > 2 ? nums[1] : -1;
    }
}

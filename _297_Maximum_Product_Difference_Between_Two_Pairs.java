package Sorting;

import java.util.Arrays;

public class _297_Maximum_Product_Difference_Between_Two_Pairs {
    public static void main(String[] args) {
        int[] nums = {5,6,2,7,4};
        Arrays.sort(nums);
        int len = nums.length-1;
        int max = nums[len]*nums[len-1] - nums[0]*nums[1];
        System.out.println( max);
    }
}

package Sorting;

import java.util.Arrays;
/*
* Given an integer array nums, return the number of elements that have both a strictly smaller and a strictly greater element appear in nums.
* */
public class _266_Count_Elements_With_Strictly_Smaller_and_Greater_Elements {
    public static int main(String[] args) {
        int[] nums = {11,7,2,15};
        Arrays.sort(nums);
        int c = 0;
        int first = nums[0], last = nums[nums.length-1];

        for(int i = 0; i < nums.length; i++){
            if(nums[i]==first || nums[i]==last)
                c++;
        }

        return nums.length-c;
    }
}

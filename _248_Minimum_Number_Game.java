package Sorting;

import java.util.Arrays;

public class _248_Minimum_Number_Game {
    public static void main(String[] args) {
        int[] nums = {5,4,2,3};
        int[] arr = new int[nums.length];
        int itr = 0;
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++){
            arr[itr++] = nums[i];
            arr[itr++] = nums[i-1];
            i++;
        }
        System.out.println( arr);
    }
}

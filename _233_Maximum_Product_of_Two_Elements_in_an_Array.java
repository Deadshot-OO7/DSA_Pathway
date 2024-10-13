package Sorting;

import java.util.Arrays;
import java.util.HashMap;

public class _233_Maximum_Product_of_Two_Elements_in_an_Array {
    public static void main(String[] args) {
        int[] nums = {3,4,5,2};

        Arrays.sort(nums);
        int prod = 1;
        for (int i = nums.length-1; i > nums.length-3; i--) {
            prod*=nums[i]-1;
        }

        System.out.println(prod);


    }
}

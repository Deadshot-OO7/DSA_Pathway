package Sorting;

import java.util.Arrays;

public class _254_Minimum_Average_of_Smallest_and_Largest_Elements {
    public static void main(String[] args) {
        int[] nums = {7,8,3,4,15,13,4,1};
        int len = nums.length;

        double[] averages = new double[len/2];

        Arrays.sort(nums);
        int i = 0;
        int j = len-1;
        double min= Integer.MAX_VALUE;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(min);
        for (int k = 0; k < len / 2; k++) {
            double avg = (nums[i]+nums[j])/2.0;
            if(avg < min)
                min = avg;
        }

        System.out.println(min);

    }
}

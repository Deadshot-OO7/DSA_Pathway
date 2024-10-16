package Sorting;

import java.util.Arrays;
import java.util.HashMap;

public class _236_Type_of_Triangle {
    public static String main(String[] args) {
        int[] nums = {4,4,4};
        Arrays.sort(nums);
        if(nums[0] + nums[1] <= nums[2]) return "none";
        if(nums[0] == nums[1] && nums[1] == nums[2]) return "equilateral";
        if(nums[0] == nums[1] || nums[1] == nums[2]) return "isosceles";
        return "scalene";
    }
}

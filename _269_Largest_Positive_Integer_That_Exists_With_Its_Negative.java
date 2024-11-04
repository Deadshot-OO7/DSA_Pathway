package StringBuilder;

import java.util.Arrays;

public class _269_Largest_Positive_Integer_That_Exists_With_Its_Negative {
    public static void main(String[] args) {
        int[] nums = {-1,10,6,7,-7,1};

        Arrays.sort(nums);

        for (int i = nums.length-1; i >=1 ; i--) {
            for (int j = nums.length-2; j >=0 ; j--) {
                if(nums[j] == nums[i]*-1){
                    System.out.println(nums[i]);
                }
            }
        }
    }
}

package Sorting;

public class _249_Count_Pairs_Whose_Sum_is_Less_than_Target {
    public static void main(String[] args) {
        int[] nums = {-1,1,2,3,1};
        int target = 2;
        int c = 0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j]<target) c++;
            }
        }
    }
}

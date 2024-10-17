package Sorting;

public class _238_How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] ans = new int[nums.length];
int itr = 0;
        for (int i = 0; i < nums.length; i++) {
            int c = 0;
            for (int j = 0; j < nums.length ; j++) {
                if(i!=j && nums[i]<nums[j]){
                    c++;
                }
            }
            ans[itr++]=c;
        }
    }
}

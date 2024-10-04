package Bitwise_Operators;

public class _204_Sum_of_Values_at_Indices_With_K_Set_Bits {
    public static void main(String[] args) {
        int[] nums = {5,10,1,5,2};
        int k = 1;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if(Integer.bitCount(i)==k){
                sum+=nums[i];
            }
        }
        System.out.println(sum);
    }
}

package Bitwise_Operators;

public class _195_Maximum_Strong_Pair_XOR_I {
    public static void main(String[] args) {
        int[] nums = {5,6,25,30};

        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                //|x - y| <= min(x, y)
                if(Math.abs(nums[i]-nums[j])<=Math.min(nums[i],nums[j]))
                {
                    if((nums[i]^nums[j])>max)
                        max=nums[i]^nums[j];
                }
            }
        }
        System.out.println(max);
    }
}

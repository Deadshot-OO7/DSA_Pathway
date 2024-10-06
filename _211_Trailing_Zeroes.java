package Bitwise_Operators;

public class _211_Trailing_Zeroes {
    public static boolean main(String[] args) {
        int counter = 0;
        int[] nums = {1,2,3,4,5};

        for(int i = 0 ; i < nums.length;i++){
            if(nums[i]%2==0)
                counter++;

            if(counter>=2)
                return true;
        }

        return false;
    }
}

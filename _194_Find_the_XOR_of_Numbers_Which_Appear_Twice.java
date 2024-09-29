package Bitwise_Operators;

import java.util.ArrayList;

public class _194_Find_the_XOR_of_Numbers_Which_Appear_Twice {
    public static int main(String[] args) {
        int[] nums = {1,2,1,3};
        int xor = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i<nums.length;i++){
            if(list.contains(nums[i]))
                xor^=nums[i];
            else
                list.add(nums[i]);
        }


        return xor;
    }
}

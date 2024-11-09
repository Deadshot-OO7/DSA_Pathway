package Sorting;

import java.util.ArrayList;

public class _276_Maximum_XOR_for_Each_Query {
    public static void main(String[] args) {
        int[] nums = {2,3,4,7};
        int maximumBit = 3;
        int limit = (int) Math.pow(2,maximumBit)-1;
        int len = 0;
        int[] answer = new int[nums.length];

        int[] xorArray = new int[nums.length];
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            result^=nums[i];
            xorArray[i] = result;
        }
        int a = 1;

        while(len < nums.length){
            int xor = xorArray[nums.length-1-len];
            System.out.println(limit^xor);
            answer[len]=limit^xor;
            len++;
        }
    }
}

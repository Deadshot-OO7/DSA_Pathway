package Hash_Table;

import java.util.HashMap;
import java.util.Map;

public class _317_Most_Frequent_Number_Following_Key_In_an_Array {
    public static void main(String[] args) {
        int[] nums = {2,2,2,2,3};
        int key = 2;

        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length-1; i++) {
            if(key == nums[i]){
                hm.put(nums[i+1], hm.getOrDefault(nums[i+1],0)+1);
            }
        }
        int max = Integer.MIN_VALUE;
        int n = 0;
        for (Map.Entry entry : hm.entrySet()){
            if((int)entry.getValue()>max) {
                max = (int) entry.getValue();
                n = (int) entry.getKey();
            }
        }

    }
}

package Hash_Table;

import java.util.HashMap;

public class _318_Maximum_Number_of_Pairs_in_Array {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1,3,2,2};
        int[] answer = new int[2];

        int count = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();

        for ( int n : nums){
            hm.put(n,hm.getOrDefault(n,0)+1);

            if(hm.get(n)==2){
                hm.remove(n);
                count++;
            }
        }
        answer[0] = count;
        answer[1] = hm.size();

    }
}

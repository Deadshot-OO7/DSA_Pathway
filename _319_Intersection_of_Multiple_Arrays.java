package Hash_Table;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class _319_Intersection_of_Multiple_Arrays {
    public static void main(String[] args) {
        int[][] nums = {{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};

        ArrayList<Integer> list = new ArrayList<>();

        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                hm.put(nums[i][j],hm.getOrDefault(nums[i][j],0)+1);
            }
        }

        for (Map.Entry<Integer,Integer> entry: hm.entrySet()){
            if(entry.getValue()>=3){
                list.add(entry.getKey());
            }
        }
        Collections.sort(list);
    }
}

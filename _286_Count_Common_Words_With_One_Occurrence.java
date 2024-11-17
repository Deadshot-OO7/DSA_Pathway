package StringBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class _286_Count_Common_Words_With_One_Occurrence {
    public static void main(String[] args) {
        String[] arr1 = {"leetcode","is","amazing","as","is"};
        String[] arr2 = {"amazing","leetcode","is"};
        HashMap<String,Integer> hm1 = new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {
            hm1.put(arr1[i],hm1.getOrDefault(arr1[i],0)+1);
        }

        HashMap<String,Integer> hm2 = new HashMap<>();

        for (int i = 0; i < arr2.length; i++) {
            hm2.put(arr2[i],hm2.getOrDefault(arr2[i],0)+1);
        }

        int count = 0;
        for ( String s : hm2.keySet()){
            if(hm2.getOrDefault(s,0) == 1 && hm1.getOrDefault(s,0)==1)
                count++;
        }

        System.out.println(count);
    }
}

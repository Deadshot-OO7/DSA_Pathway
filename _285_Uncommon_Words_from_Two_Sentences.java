package StringBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class _285_Uncommon_Words_from_Two_Sentences {
    public static void main(String[] args) {
        String s1 = "this apple is sweet", s2 = "this apple is sour";
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");

        HashMap<String,Integer> hm = new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {
            hm.put(arr1[i],hm.getOrDefault(arr1[i],0)+1);
        }

        for (int i = 0; i < arr2.length; i++) {
            hm.put(arr2[i],hm.getOrDefault(arr2[i],0)+1);
        }

        ArrayList<String> ls = new ArrayList<>();

        for(Map.Entry<String,Integer> entry : hm.entrySet()){
            if(entry.getValue() == 1){
                ls.add(entry.getKey());
            }
        }

        System.out.println(ls);

        String[] ans = new String[ls.size()];

        for (int i = 0; i < ls.size(); i++) {
            ans[i] = ls.get(i);
        }
    }
}

package StringBuilder;

import java.util.*;

public class _287_Kth_Distinct_String_in_an_Array {
    public static String main(String[] args) {
        String[] arr1={"d","b","c","b","c","a"};
        HashMap<String,Integer> hm1 = new HashMap<>();
        ArrayList<String> ls = new ArrayList<>();
        int k = 2;
        for (int i = 0; i < arr1.length; i++) {
            hm1.put(arr1[i],hm1.getOrDefault(arr1[i],0)+1);
        }

        int count = 0;
        for ( String s : hm1.keySet()){
            if(hm1.getOrDefault(s,0) == 1){
                count++;
                ls.add(s);
            }
        }

        if(count < k)
            return "";

        String s1 = "";
        count = 0;
        for (int i = 0; i < arr1.length; i++) {
            if(ls.contains(arr1[i])){
                count++;
                if(count == k){
                    s1 = arr1[i];
                    break;
                }

            }
        }

        return s1;
    }
}

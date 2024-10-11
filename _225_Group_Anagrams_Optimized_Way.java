package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class _225_Group_Anagrams_Optimized_Way {
    public static void main(String[] args) {
        List<List<String>> res = new ArrayList<>();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        HashMap<String,ArrayList<String>> hm = new HashMap<>();
        for (String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String s = new String(chars);

            if(!hm.containsKey(s))
                hm.put(s,new ArrayList<>());

            hm.get(s).add(str);
        }

        for( List<String> ls : hm.values())
            res.add(ls);

        System.out.println(res);
    }
}

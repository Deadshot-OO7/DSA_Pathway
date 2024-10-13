package Sorting;

import java.util.*;

public class _234_Sort_Array_by_Increasing_Frequency {
    public static void main(String[] args) {
        int[] nums = {-1,1,-6,4,5,-6,1,4,1};
        ArrayList<Integer> res = new ArrayList<>();
        int[] ans = new int[nums.length];
        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int n : nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        System.out.println(hm);
        Set<Integer> list = new TreeSet<>();
        for (int n : hm.values()){
            list.add(n);
        }

        System.out.println(list);

        ArrayList<Integer> list1 = new ArrayList<>(list);

        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            ArrayList<Integer> ls = new ArrayList<>();
            int c = 0;
            if(entry.getValue() == list1.getFirst()){
                ls.add(entry.getKey());
                c++;
            }
            if(c>1)
                ls.sort((a,b)->b-a);

            res.addAll(ls);


        }
        System.out.println(res);
    }
}

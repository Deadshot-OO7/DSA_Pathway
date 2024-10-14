package Sorting;

import java.util.*;

public class _234_Sort_Array_by_Increasing_Frequency {
    public static void main(String[] args) {
        int[] nums = {-1,1,-6,4,5,-6,1,4,1};
//        Arrays.sort(nums);
//        for (int n : nums)
//            System.out.print(n+" ");
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


        ArrayList<Integer> list1 = new ArrayList<>(list);
        System.out.println(list1);

        while(res.size()!= nums.length){
            int c = 0;
            ArrayList<Integer> ls = new ArrayList<>();
            for(Map.Entry<Integer,Integer> entry : hm.entrySet()) {

                if(entry.getValue() == list1.getFirst()){
                    ls.add(entry.getKey());
                    c++;
                }
            }
            list1.removeFirst();
            System.out.println("ls-->"+ls);
            System.out.println("list1-->"+list1);
            if(c>1)
                ls.sort((a,b)->b-a);

            for(int num : ls){
                for (int i = 0; i < hm.get(ls.getFirst()); i++) {
                    res.add(num);
                }
            }

            System.out.println("res-->"+res);

        }

        System.out.println(res);

        Math.multiplyExact(2,2);
    }
}

package Bitwise_Operators;

import java.util.ArrayList;

public class _209_Minimum_Operations_to_Collect_Elements {
    public static void main(String[] args) {
        int[] nums ={1,2,2};
        int k = 2;

        ArrayList<Integer> list = new ArrayList<>();
        for(int n : nums)
            list.add(n);
        System.out.println(list);
        ArrayList<Integer> sortedList = new ArrayList<>();
        for (int i = 1; i <= k; i++) {
            sortedList.add(i);
        }
        System.out.println(sortedList);
        int count = 0;
        int match = 0;
        while (sortedList.size()!=0){
            if(sortedList.contains(list.getLast())){
                sortedList.removeIf(num -> num == list.getLast());
//                sortedList.remove();
                match++;
            }
            count++;
            list.removeLast();
        }

        System.out.println(count);
    }
}

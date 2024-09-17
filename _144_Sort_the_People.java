package StringBuilder;

import java.util.*;

public class _144_Sort_the_People {
    public static void main(String[] args) {
       String[] names = {"Alice","Bob","Bob"};
        int[] heights = {155,185,150};
        String[] sortedNames = new String[heights.length];
        int itr = 0;
        HashMap<Integer,String> hm = new HashMap<>();

        for (int i = 0; i < heights.length; i++) {
            hm.put(heights[i],names[i]);
        }

        Arrays.sort(heights);

        for (int i = heights.length-1; i >=0 ; i--) {
            sortedNames[itr++] = hm.get(heights[i]);
        }


    }
}

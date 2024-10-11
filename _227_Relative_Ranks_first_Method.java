package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _227_Relative_Ranks_first_Method {
    public static void main(String[] args) {
        int[] score = {10,3,8,9,4};
        String[] ans = new String[score.length];

        for (int i = 0; i < score.length; i++) {
            ans[i] = Integer.toString(score[i]);
        }

        Arrays.sort(score); //reversing the score

        ArrayList<String> sortedList = new ArrayList<>();
        ArrayList<String> ansList = new ArrayList<>();

        for (String n : ans)
            ansList.add(n);

        for (int n : score)
            sortedList.add(""+n);

        Collections.reverse(sortedList);

        System.out.println(ansList);
        System.out.println(sortedList);

        for (int i = 0; i < sortedList.size(); i++) {
            int index = ansList.indexOf(sortedList.get(i));

            if(i==0)    //biggest ele
                ans[index] = "Gold Medal";

            if(i==1)    //Second Big ele
                ans[index] = "Silver Medal";

            if(i==2)    //Third ele
                ans[index] = "Bronze Medal";

            if(i>2){
                ans[index] = ""+(i+1);
            }

        }

        for (String n : ans)
            System.out.println(n);



    }
}

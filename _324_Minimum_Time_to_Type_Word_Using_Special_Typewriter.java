package Strings;

import java.util.Map;

public class _324_Minimum_Time_to_Type_Word_Using_Special_Typewriter {
    public static void main(String[] args) {
        String word = "zjpc";

        char start = 'a';
        int step = 0;

        for (int i = 0; i < word.length(); i++) {
            char curr =  word.charAt(i); //m
            int diff = Math.abs(curr - start); //clockwise
            int min = Math.min(diff,26-diff);
            step+=min+1;
            start = curr;
        }

        System.out.println(step);
    }
}

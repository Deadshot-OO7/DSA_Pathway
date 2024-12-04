package Strings;

import java.util.Hashtable;
import java.util.Map;

public class _311_Longest_Palindrome {
    public static void main(String[] args) {
        String s = "bananas";
        int count = 0;
        boolean isSingleCharPresent = false;
        Hashtable<Character,Integer> ht = new Hashtable<>();

        for (int i = 0; i < s.length(); i++) {
            ht.put(s.charAt(i),ht.getOrDefault(s.charAt(i),0)+1);
        }
        System.out.println(ht);
        System.out.println(ht.size());
        int maxOdd = 0;
        for (int entry : ht.values()){
            if(entry % 2 == 0)
                count+=entry;
            else{
                isSingleCharPresent = true;
                if(entry> maxOdd)
                    maxOdd = entry;

            }
        }
        count += maxOdd;

        if(isSingleCharPresent && maxOdd == 0)
            count++;

        System.out.println(count);
    }
}

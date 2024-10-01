package Bitwise_Operators;
/*
* You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.

Return the number of consistent strings in the array words.



Example 1:

Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
Output: 2
Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
Example 2:

Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
Output: 7
Explanation: All strings are consistent.
Example 3:

Input: allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
Output: 4
Explanation: Strings "cc", "acd", "ac", and "d" are consistent.

* */
public class _196_Count_the_Number_of_Consistent_Strings {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        int count = 0;
        boolean isConsistent = true;
        for(int i = 0; i < words.length; i++){
            isConsistent = true;
            char[] arr = words[i].toCharArray();
            for(int j = 0; j < arr.length; j++){
                if(!allowed.contains(""+arr[j]))
                {
                    isConsistent = false;
                    break;
                }
            }
            if(isConsistent)
                count++;
        }
//        return count;
        System.out.println(count);
    }
}

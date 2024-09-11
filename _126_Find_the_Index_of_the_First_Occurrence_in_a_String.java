package StringBuilder;
/*
* Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.



Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
* */
public class _126_Find_the_Index_of_the_First_Occurrence_in_a_String {
    public static void main(String[] args) {
        String haystack = "sadbutsad", needle = "sad";

        if(needle.length()>haystack.length())
            System.out.println(-1);
//            return -1;

        if(haystack.contains(needle)){
            for (int i = 0; i <= haystack.length() - needle.length(); i++) {
                if(needle.compareTo(haystack.substring(i,i+needle.length()))==0){
                    System.out.println(i);
//                    return i;
                }
            }
        }
        System.out.println(-1);
//        return -1;
    }
}

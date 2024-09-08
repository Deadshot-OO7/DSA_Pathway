package StringBuilder;
/*
* We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.



Example 1:

Input: word = "USA"
Output: true
Example 2:

Input: word = "FlaG"
Output: false
* */
public class _113_Detect_Capital {
    public static boolean main(String[] args) {

        String word = "FlaG";
        boolean isAllLower = true,isAllUpper = true,isTitle = false;

        StringBuilder sb = new StringBuilder(word);

        for (int i = 1; i < sb.length(); i++) {
            if(sb.charAt(0)>=65 && sb.charAt(0)<=90) {
                if (sb.charAt(i) >= 97 && sb.charAt(i) <= 122) {

                } else {
                    isTitle = false;
                }
            }
        }

        for (int i = 1; i < sb.length(); i++) {
//            if(sb.charAt(0)>=65 && sb.charAt(0)<=90) {
                if (sb.charAt(i) >= 97 && sb.charAt(i) <= 122) {

                } else {
                    isAllLower = false;
                }
//            }
        }

        for (int i = 0; i < sb.length(); i++) {

            if(sb.charAt(i)>=65 && sb.charAt(i)<=90){

            }else {
                isAllUpper = false;
            }
        }

        if(isTitle || isAllUpper || isAllLower)
            return true;
        else
            return false;


//        return true;
    }
}

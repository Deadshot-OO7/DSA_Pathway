package StringBuilder;
/*
* The power of the string is the maximum length of a non-empty substring that contains only one unique character.

Given a string s, return the power of s.



Example 1:

Input: s = "leetcode"
Output: 2
Explanation: The substring "ee" is of length 2 with the character 'e' only.
Example 2:

Input: s = "abbcccddddeeeeedcba"
Output: 5
Explanation: The substring "eeeee" is of length 5 with the character 'e' only.
*
* */
public class _110_Consecutive_Characters {
    public static Integer main(String[] args) {
        String s = "abbcccddddeeeeedcba";
        int maxPower = 1;
        int power = 1;

        for (int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) == s.charAt(i+1)){
                power++;
                if(power>maxPower)
                    maxPower = power;
            }else {
                power = 1;
            }
        }
        return maxPower;
    }
}

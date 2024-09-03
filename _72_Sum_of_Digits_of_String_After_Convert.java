package Two_D_Arrays;
/*
* Example 1:

Input: s = "iiii", k = 1
Output: 36
Explanation: The operations are as follows:
- Convert: "iiii" ➝ "(9)(9)(9)(9)" ➝ "9999" ➝ 9999
- Transform #1: 9999 ➝ 9 + 9 + 9 + 9 ➝ 36
Thus the resulting integer is 36.
Example 2:

Input: s = "leetcode", k = 2
Output: 6
Explanation: The operations are as follows:
- Convert: "leetcode" ➝ "(12)(5)(5)(20)(3)(15)(4)(5)" ➝ "12552031545" ➝ 12552031545
- Transform #1: 12552031545 ➝ 1 + 2 + 5 + 5 + 2 + 0 + 3 + 1 + 5 + 4 + 5 ➝ 33
- Transform #2: 33 ➝ 3 + 3 ➝ 6
Thus the resulting integer is 6.
*
* */
public class _72_Sum_of_Digits_of_String_After_Convert {
    public static void main(String[] args) {
        String s = "leetcode";
        int k = 2; // number of transforms

        int itr=0,sum=0;
        String trans = "";

        for (int i = 0; i < s.length(); i++) {
            trans+=(int)s.charAt(i) - (int)'a' + 1; //12
        }

        System.out.println(trans);

        while(itr++<k){   // method for transform
            sum=0;
            for (int i = 0; i < trans.length(); i++) {
                sum += Integer.parseInt(String.valueOf(trans.charAt(i)));
            }
            trans = "";
            trans = "" + sum;
        }

        System.out.println(sum);




    }
}

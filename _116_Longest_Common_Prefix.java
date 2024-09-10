package StringBuilder;
/*
* Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
* */
public class _116_Longest_Common_Prefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};

        StringBuilder sb = new StringBuilder("");
        int itr=0;
        int smallestLength = Integer.MAX_VALUE;
        boolean same = true;
        for (int i = 0; i < strs.length; i++) {
            if(strs[i].length()<smallestLength)
                smallestLength=strs[i].length();
        }

        for (int i = 0; i < smallestLength; i++) {
            char ch = strs[0].charAt(i); //'f'
            for (int j = 1; j < strs.length; j++) {
                if(ch == strs[j].charAt(i)){

                }else {
                    same=false;
                    break;
                }

            }
            if(same)
                sb.append(ch);
            else
                break;
        }
        System.out.println(sb);
    }
}

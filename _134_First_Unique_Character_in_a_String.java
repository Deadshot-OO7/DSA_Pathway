package StringBuilder;

import java.util.Hashtable;
import java.util.Map;

public class _134_First_Unique_Character_in_a_String {
    public static int main(String[] args) {
        String s = "leetcode";
        char[] strTochar = s.toCharArray();
        //If in testcases, there is a long string which is giving TLE
        //then you can use array.

        for (int i = 0; i < strTochar.length; i++) {
            for (int j = 0; j < strTochar.length; j++) {
                if (i != j && strTochar[i] == strTochar[j]) {
                    break;
                }

                if (j == strTochar.length - 1) {
                    return i;
                }
            }
        }

        return -1;

    }
}

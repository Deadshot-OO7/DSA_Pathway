package Strings;
/*
* Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’.
Example :
original = “eabcdef’ ; result = “iabcdif”
Original = “xyz” ; result = “xyz”

* */
public class _97_String_Replacement {
    public static void main(String[] args) {
        String s = "eabcdef";
        String res = "";
        System.out.println(s.charAt(0));
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='e'){
                res = res + "i";
            }
            else {
                res = res + s.charAt(i);
            }
        }
        System.out.println(res);
    }
}

package StringBuilder;

public class _107_Reverse_Words_in_a_String_My_Solution {
    public static String main(String[] args) {
        String s = "Let's take LeetCode contest";
        String rev ="";
        StringBuilder sb = new StringBuilder(s);
        int prev = -1;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)==' ' ){
                rev = rev + new StringBuilder(sb.substring(prev+1,i)).reverse();
                rev+=" ";
                prev=i;
            }else if(i==s.length()-1){
                rev = rev + new StringBuilder((sb.substring(prev+1))).reverse();

            }
        }
        return rev;
    }
}

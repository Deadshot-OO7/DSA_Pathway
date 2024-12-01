package Recursion;

public class _305_Print_a_string_in_reverse {
    public static void main(String[] args) {
        String str = "abcd";

        prnt(str);

    }

    public static void prnt(String s){
        if(s.length() == 1){
            System.out.println(s.charAt(0));
            return;
        }
        System.out.println(s.charAt(s.length()-1));
        prnt(s.substring(0,s.length()-1));
    }
}

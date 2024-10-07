package Bitwise_Operators;

public class _214_Remove_Trailing_Zeros_From_a_String {
    public static void main(String[] args) {
        String num = "51230100";

        for (int i = num.length()-1; i >=0 ; i--) {
            if(num.charAt(i)!='0'){
                num=num.substring(0,i);
                break;
            }
        }
        System.out.println(num);
    }
}

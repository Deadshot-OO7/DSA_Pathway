package Bitwise_Operators;

public class _198_Reverse_bits {
    public static void main(String[] args) {
        String s = "00000010100101000001111010011100";

        int sum = 0;

        for (int i = 0; i < 32; i++) {
            sum<<=1;
            sum|= s.charAt(s.length()-1-i)-'0';
        }
        System.out.println(sum);
    }
}

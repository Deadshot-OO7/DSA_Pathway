package Bitwise_Operators;

public class _199_Number_of_Bit_Changes_to_Make_Two_Integers_Equal {
    public static void main(String[] args) {
        int n = 14, k = 13;

        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(k));

        StringBuilder sb1 = new StringBuilder(Integer.toBinaryString(n));
        StringBuilder sb2 = new StringBuilder(Integer.toBinaryString(k));

        if(sb1.length()!=sb2.length())
            System.out.println(-1);

        // now all same length
        int count = 0;
        for (int i = 0; i < sb1.length(); i++) {
            if(sb1.charAt(i)=='0' && sb2.charAt(i)=='1'){
                System.out.println(-1);
                break;
            }

            if(sb1.charAt(i)=='1' && sb2.charAt(i)=='0')
                count++;

        }
    }
}

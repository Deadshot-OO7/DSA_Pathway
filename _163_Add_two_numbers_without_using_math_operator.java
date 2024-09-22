package Bitwise_Operators;

public class _163_Add_two_numbers_without_using_math_operator {
    public static void main( String[] args){
        int a = 16; // 1110
        int b = 4;  // 0100

        int sum = 0;
        int carry = 0;

        while(b!=0){
            sum = a ^ b;        //1010  //0010  //10010
            carry = (a & b)<<1; //1000 //10000  //00000

            a = sum;
            b = carry;
        }

        System.out.println(a);


    }
}

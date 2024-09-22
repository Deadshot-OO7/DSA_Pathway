package Bitwise_Operators;

public class _160_Swapping_two_Variables_Using_XOR {
    public static void main(String[] args){
        int a = 5;
        int b = 6;

        a = a^b;
        b= a^b;
        a = a^b;

        System.out.println(a);
        System.out.println(b);
    }
}

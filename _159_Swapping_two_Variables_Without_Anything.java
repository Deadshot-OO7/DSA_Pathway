package Bitwise_Operators;

public class _159_Swapping_two_Variables_Without_Anything {
    public static void main(String[] args){
        int a = 5;
        int b = 6;

        a = a+b;//11
        b= a-b;//11-6=5
        a=a-b;

        System.out.println(a);
        System.out.println(b);
    }
}

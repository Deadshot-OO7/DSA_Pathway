package Bitwise_Operators;

public class _156_Check_if_a_number_is_odd_or_even {
    public static void main(String[] args){
        int n = 124; // 0101

        int bitmask = 1 ;

        if( (bitmask & n) == 0)
            System.out.println("Number is even");
        else
            System.out.println("Number is odd");
    }
}

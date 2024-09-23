package Bitwise_Operators;

public class _169_two_numbers_have_opposite_signs {
    public static void main(String[] args) {
        int a  = 4;
        int b = 3;

        if( (a ^ b ) < 0){
            System.out.println("Opposite");
        }
        else
            System.out.println("Not opposite");
    }
}

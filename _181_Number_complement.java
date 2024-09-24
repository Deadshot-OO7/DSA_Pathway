package Bitwise_Operators;

public class _181_Number_complement {
    public static void main(String[] args) {

        int n = 4; //101

        if(n == 0)
            System.out.println(1);

        int number = Integer.toBinaryString(n).length();

        int bitMask = (1 << number)-1;

        System.out.println( n ^ bitMask );
    }
}

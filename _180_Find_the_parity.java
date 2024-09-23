package Bitwise_Operators;

public class _180_Find_the_parity {
    public static void main(String[] args) {
        int n = 10;

        if(Integer.bitCount(n)%2==0)
            System.out.println("Even number of set bits");
        else
            System.out.println("Odd number of set bits");
    }
}

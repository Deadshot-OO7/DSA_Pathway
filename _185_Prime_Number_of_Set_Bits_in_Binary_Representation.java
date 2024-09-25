package Bitwise_Operators;

public class _185_Prime_Number_of_Set_Bits_in_Binary_Representation {
    public static void main(String[] args) {
        int left = 6, right = 10;
        int count = 0;

        for (int i = left ; i <= right ; i++) {
            if(isPrime(Integer.bitCount(i)))
                count++;
        }

        System.out.println(count);

    }

    public static boolean isPrime( int n ){
        boolean notPrime = false;
        for (int i = 2; i < n ; i++) {
            if( n % i ==  0) {
                notPrime = true;
                break;
            }
        }

        if(!notPrime && n!=1)
            return true;

        return false;

    }
}

package Bitwise_Operators;
/*
* You are given a positive integer n.

Let even denote the number of even indices in the binary representation of n with value 1.

Let odd denote the number of odd indices in the binary representation of n with value 1.

Note that bits are indexed from right to left in the binary representation of a number.

Return the array [even, odd].
* */
public class _190_Number_of_Even_and_Odd_Bits {
    public static int[] main(String[] args) {
        int [] arr = new int [2];
        int n = 50;
        int even=0,odd=0;
        int itr = 0;
        String s = Integer.toBinaryString(n);

        for( int i = s.length()-1; i>=0;i--){
            if(s.charAt(i)=='1'){
                if(itr%2==0)
                    even++;
                else
                    odd++;
            }
            itr++;
        }
        arr[0]=even;
        arr[1]=odd;

        return arr;
    }
}

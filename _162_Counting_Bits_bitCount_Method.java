package Bitwise_Operators;

public class _162_Counting_Bits_bitCount_Method {
    public static void main(String[] args){
        int n = 5;
        int[] arr = new int[n+1];

        for(int i = 0; i<=n;i++){
            arr[i] = Integer.bitCount(i);
            System.out.println(arr[i]);
        }
    }
}

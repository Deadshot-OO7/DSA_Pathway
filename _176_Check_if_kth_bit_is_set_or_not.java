package Bitwise_Operators;

public class _176_Check_if_kth_bit_is_set_or_not {
    public static void main(String[] args) {
        int n = 37;
        int pos = 4;

        int bitmask = 1 << (pos - 1);
        System.out.println(Integer.toBinaryString(n));
        if(( n & bitmask) == 0){
            System.out.println("At given position, bit is 0");
        }else
            System.out.println("Not zero");
    }
}

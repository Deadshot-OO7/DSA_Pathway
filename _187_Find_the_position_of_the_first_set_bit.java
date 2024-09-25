package Bitwise_Operators;

public class _187_Find_the_position_of_the_first_set_bit {
    public static void main(String[] args) {
        int n = 12;//

        int count = 0;
        System.out.println(Integer.toBinaryString(n));

        while(n!=0){
            if((n & 1) == 1){
                break;
            }
            n=n>>1;
            count++;
        }
        System.out.println(count);
    }
}

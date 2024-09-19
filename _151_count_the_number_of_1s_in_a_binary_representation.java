package Bitwise_Operators;

public class _151_count_the_number_of_1s_in_a_binary_representation {
    public static void main(String[] args) {

        int n = 15; // 0111
        int cntr = 0;

        while(n>=1){
            if(n%2==1)
                ++cntr;
            n=n/2;
        }
        System.out.println(cntr);
    }
}

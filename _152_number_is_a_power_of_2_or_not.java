package Bitwise_Operators;
// A number will be power of 2 if and only if, its binary representation contains
// just one count of binary 1, rest all zero
public class _152_number_is_a_power_of_2_or_not {
    public static void main(String[] args) {
        int number = 256; //10000
        int n = number;
        int cntr = 0;
        while(n>=1){
            if(n%2==1)
                ++cntr;
            n=n/2;
        }

        if(cntr == 1)
            System.out.println(number+" is power of 2");
        else
            System.out.println("Not a power of 2");


    }
}

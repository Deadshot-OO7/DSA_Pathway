package Bitwise_Operators;

public class _170_Xor_of_all_elements_till_n {
    public static void main(String[] args) {
        int n = 45;

        int xor = 0;

        while(n>=0){
            xor^=n;
            n--;
        }
        System.out.println(xor);

        //-----------------------
        //Xor follows a pattern
        //if n%4==0 --> n
        //if n%4==1 --> 1
        //if n%4==2 --> n+1
        //if n%4==3 --> 0
    }
}

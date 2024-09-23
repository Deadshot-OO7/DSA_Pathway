package Bitwise_Operators;

public class _171_Xor_of_all_elements_till_n_Using_Xor_Pattern {
    public static void main(String[] args) {
        int n = 45;

        if(n%4==0)
            System.out.println(n);
        else if (n%4==1) {
            System.out.println(1);
        } else if (n%4==2) {
            System.out.println(n+1);
        }else if(n%4==3){
            System.out.println(0);
        }
    }
}

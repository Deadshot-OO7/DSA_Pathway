package Bitwise_Operators;

public class _192_Number_of_Steps_to_Reduce_a_Number_to_Zero {
    public static void main(String[] args) {
        int n = 8;
        int count = 0;

        while(n!=0){
            if(n%2==0)
                n/=2;
            else
                n-=1;
            count++;
        }
        System.out.println(count);
    }
}

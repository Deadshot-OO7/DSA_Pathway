package Recursion;

public class _303_Power_Log_n_height_Memory_optimization {
    public static void main(String[] args) {
        int n = 3;
        int x = 4;

        System.out.println(calcPower(x,n));
    }

    public static int calcPower( int x , int n){
        if(x == 0)
            return 0;
        if( n == 0)
            return 1;

        if( n % 2 == 0){
            return calcPower(x,n/2) * calcPower(x,n/2);
        }else {
            return calcPower(x,n/2) * calcPower(x,n/2) * x;
        }
    }
}

package Recursion;

public class _302_Power_with_Stack_Height {
    public static void main(String[] args) {
        int x = 4;
        int n = 3;

        System.out.println(power( 4, 0));
    }

    public static int power( int x , int n ){
        if(x == 0)
            return 0;
        if( n == 0)
            return 1;

        return x * power( x , --n);
    }
}

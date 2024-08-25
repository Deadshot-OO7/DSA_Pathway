package DSA_Revision;

public class _31_GCD_reverse {
    public static void main(String[] args) {

        System.out.println(getGcd(98,56));
    }

    public static int getGcd( int a , int b){
        int min = Math.min(a, b);

        while (min>0){
            if( a % min == 0 && b % min == 0 ){
               break;
            }
            min--;
        }
        return min;
    }
}

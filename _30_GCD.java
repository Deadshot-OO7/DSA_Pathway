package DSA_Revision;

public class _30_GCD {
    public static void main(String[] args) {

        System.out.println(getGCD(98,56));

    }

    public static int getGCD(int a, int b){
        int gcd = 1;
        int result = 1;
        int min = Math.min(a, b);

        while (gcd<=min){
            if(a % gcd == 0 && b % gcd == 0){
               result = gcd;
            }
            gcd ++ ;
        }


        return result;
    }
}

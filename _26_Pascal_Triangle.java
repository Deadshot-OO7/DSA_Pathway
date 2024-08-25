package DSA_Revision;

public class _26_Pascal_Triangle {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 4; j >=0 ; j--) {
                if(j<=i)
                    System.out.print(" " + (factorial(i)/(factorial(j)*factorial(i-j))));
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static int factorial(int n){
        int fact = 1;
        for (int i = n; i >=1 ; i--) {
            fact = fact*i;
        }
        return fact;
    }
}

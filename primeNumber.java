package methods_and_functions;

public class primeNumber {
    public static void main(String[] args) {

        int n = 7;

        System.out.println("Is " + n + " a prime number ? Answer is :- " + isPrime(n));
    }

    public static boolean isPrime(int n){
        for (int i = 2; i < n ; i++) {

            if(n % i == 0) return false;

        }
        return  true;
    }
}

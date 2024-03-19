package methods_and_functions;
import java.util.Scanner;

public class GCD1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b;
        int temp = 1;
        System.out.println("Enter the two numbers for GCD :- ");
        a = sc.nextInt();
        b = sc.nextInt();
        int[] arr1 = list_of_Factors(a);
        int[] arr2 = list_of_Factors(b);


        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length ; j++) {

                if(arr1[i]==b){
                    temp = b;
                    break;
                }
                if(arr2[j]==a){
                    temp = a;
                    break;
                }

                if(arr1[i] == arr2[j] && arr1[i] != 0 ){
                    if(arr1[i]>temp)
                        temp = arr1[i];
                }

            }

        }

        System.out.println("THE GCD IS : " + temp);
    }

    public static int[] list_of_Factors(int a ){

        int index = 0;
        int[] factors = new int[10];

        for (int i = 2; i <= a ; i++) {
            if(a % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;

    }
}

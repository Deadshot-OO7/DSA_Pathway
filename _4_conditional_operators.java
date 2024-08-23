package DSA_Revision;

import java.util.Scanner;

public class _4_conditional_operators {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for button");
//        int age = sc.nextInt();

//        if(age > 18)
//            System.out.println("You are an adult");
//        else
//            System.out.println("You are not an adult");

        //Switch Use

        int button = sc.nextInt();
        switch (button){
            case 1 :
                System.out.println("Namaste");
                break;
            case 2 :
                System.out.println("Hello");
                break;
            case 3 :
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid Button");
                break;
        }
    }
}

package One_D_Arrays;

import java.util.Scanner;

//Take an array of names as input from the user and print them on the screen.
public class names_array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many names you want to print?");
        int size = sc.nextInt();
        sc.nextLine();//used to consume the enter that we will hit after giving size.
        //cuz the next stmt is sc.nextLine();
        String[] names = new String[size];

        for (int i = 0; i < size; i++) {
            names[i]=sc.nextLine();
        }

        //output
        for (int i = 0; i < size; i++) {
            System.out.println(names[i]);
        }

    }
}

package Oops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        thing1.num = 3;
        thing2.num = 5;

        thing1.word = "From Thing1";
        thing2.word = "From Thing2";

        System.out.println(thing1.num + thing2.num);
    }
}

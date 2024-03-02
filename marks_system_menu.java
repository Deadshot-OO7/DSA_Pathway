package Loops_in_Java;

import java.util.Scanner;

public class marks_system_menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("If you want to insert your marks, type '1'\nIf you want to stop then press '0'");
        int menu = sc.nextInt();
        if(menu ==1) {

            do {
                System.out.println("Enter your number");
                int n = sc.nextInt();

                if (n >= 90)
                    System.out.println("This is good");
                else if (n >= 60) {
                    System.out.println("This is also good");
                } else if (n >= 0) {
                    System.out.println("This is good as well");
                }else
                    System.out.println("Invalid");

                System.out.println("Again you want to insert your marks, type '1'\nIf you want to stop then press '0'");
                menu = sc.nextInt();

                if(menu == 0) System.out.println("Program has ended");
                else if ( menu != 1) {
                    System.out.println("Invalid input");
                }
            } while (menu == 1 );
        } else if ( menu == 0) {
            System.out.println("Program ended");
        }
        else
            System.out.println("Please enter between 0 and 1");

        }
    }


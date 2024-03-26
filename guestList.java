package CodingChallenge;

import java.util.Scanner;

public class guestList {
    static Scanner scanner = new Scanner(System.in);
    static String[] guests = new String[10];
    static String[] temp = new String[10];
    static int counter = 0;
    static boolean guestsPresents = false;

    public static void main(String[] args) {


        do {
            System.out.println("-----------------------------------");
            System.out.println("---Guests---\n");

            displayGuests(guests);
            displayMenu();
            int option = getOption();
            scanner.nextLine();

            System.out.println();

            if (option == 1) {
                addGuests();
            } else if (option == 2) {
                removeGuests();
            } else if (option == 5) {
                System.out.println("Exiting...");
                break;
            } else if (option == 3) {
                replaceGuest();
            }
            else if (option == 4) {
                insertGuest();
            }
        } while (true);

    }

    public static void displayGuests(String[] guests) {

        String[] temp = new String[guests.length];
        int ti = 0;
        for (int i = 0; i < guests.length; i++) {


            if (guests[i] != null) {
                temp[ti] = guests[i];
                ti++;
            }
        }

        guests = temp;

        for (int i = 0; i < guests.length; i++) {
            if (guests[i] != null) {
                System.out.print(i + 1 + " - ");
                System.out.println(guests[i]);
                guestsPresents = true;
            }
        }

        if (!guestsPresents)
            System.out.println("Guest list is empty");

    }

    public static void displayMenu() {
        System.out.println("\n-----------------------------------");
        System.out.println("---Menu---\n");
        System.out.println("1 - Add Guest");
        System.out.println("2 - Remove Guest");
        System.out.println("3 - Rename Guest");
        System.out.println("4 - Insert Guest");
        System.out.println("5 - Exit");
    }

    public static int getOption() {
        System.out.print("Option: ");
        return scanner.nextInt();
    }

    public static void addGuests() {
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] == null) {
                System.out.print("Name: ");
                guests[i] = scanner.nextLine();
                counter++;
                break;
            }
        }
    }

    public static void removeGuests() {
        System.out.print("Number: ");
        int num = scanner.nextInt();

        if (num >= 1 && num <= 10 && guests[num - 1] != null) {
            for (int i = 0; i < guests.length; i++) {
                if (guests[i] != null && i == num - 1) {
                    counter--;
                    guests[i] = null;
                    break;
                }
            }
        } else
            System.out.println("Error: There is no guest with that number.");

    }

    public static void replaceGuest() {
        if (guestsPresents) {
            System.out.println("Which number you want to rename");
            int num = scanner.nextInt();
            scanner.nextLine();
            if (num >= 1 && num <= 10 && guests[num - 1] != null) {
                System.out.println("Enter the new Name");
                String name = scanner.next();

                for (int i = 0; i < guests.length; i++) {

                    if (i + 1 == num) {
                        guests[i] = name;
                        break;
                    }


                }
            }else
                System.out.println("Error. No number is present in this list.");




        } else
            System.out.println("List is empty.");
    }

    public static void insertGuest(){
        String temp;
        if(guestsPresents){
            System.out.println("In which position you want to insert?");
            int num = scanner.nextInt();
            scanner.nextLine();
            if (num >= 1 && num <= 10 && guests[num - 1] != null) {
                System.out.println("Enter the new Name");
                String name = scanner.next();

                for (int i = 0; i < guests.length; i++) {

                    if (i + 1 >= num) {
                        temp = guests[i];
                        guests[i] = name;
                        name = temp;
                    }
                }
            }else
                System.out.println("Error. No number is present in this list.");
        }else
            System.out.println("List is empty.");
    }
}

package CodingChallenge;

import java.util.Scanner;

public class challenge2_Q2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the total bill amount?");
        double totalBill = scanner.nextDouble();

        System.out.println("\nHow many people you are ?");
        int totalPeople = scanner.nextInt();

        System.out.format("\nSo each share per head is - %.2f", totalBill/totalPeople);
    }
}

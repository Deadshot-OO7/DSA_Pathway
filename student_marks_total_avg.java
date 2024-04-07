package One_D_Arrays;

import java.util.Scanner;

public class student_marks_total_avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int n = sc.nextInt();
        int rollNo[] = new int[n];
        int s1[] = new int[n];
        int s2[] = new int[n];
        int s3[] = new int[n];
        double total[] = new double[n];
        double avg[] = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter student " + (i+1) + " details:");
            System.out.print("Roll No: ");
            rollNo[i] = sc.nextInt();
            System.out.print("Subject 1 Marks: ");
            s1[i] = sc.nextInt();
            System.out.print("Subject 2 Marks: ");
            s2[i] = sc.nextInt();
            System.out.print("Subject 3 Marks: ");
            s3[i] = sc.nextInt();
            total[i]= (s1[i] + s2[i] + s3[i]);
            avg[i] = total[i]/ 3.0;
        }
        System.out.println("Roll No \t Total \t Average ");
        for (int i = 0; i < n; i++) {
            System.out.println(rollNo[i] + "\t" + total[i] + "\t" + avg[i]);
        }
    }
}

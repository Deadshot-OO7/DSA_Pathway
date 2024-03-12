package Loops_in_Java;

public class practice {
    public static void main(String[] args) {
        int r = 4;
        int c = 4;
        int sum = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(sum +" ");
                sum++;
            }
            System.out.println();
        }
    }
}

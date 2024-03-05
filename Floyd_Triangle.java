package Loops_in_Java;

public class Floyd_Triangle {
    public static void main(String[] args) {
        
        int r = 5;
        int c = 5;
        int sum = 1;

        for (int i = 0; i <r; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(sum + " ");
                sum++;
            }
            System.out.println();
        }


    }
}

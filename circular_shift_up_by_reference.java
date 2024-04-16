package Two_D_Arrays;

public class circular_shift_up_by_reference {
    public static void main(String[] args) {
        int [][]arr = {{1,2,3},{4,5,6},{7,8,9},{12,13,14}};
//        int [][] temp = new int[arr.length][arr[0].length];

        for(int row=0; row<arr.length;row++) {
            for (int col=0;col<arr[0].length;col++) {
                System.out.print(arr[row][col]+ " ");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i+1][j];
                arr[i+1][j] = temp;
            }
        }

        System.out.println();
        for(int row=0; row<arr.length;row++) {
            for (int col=0;col<arr[0].length;col++) {
                System.out.print(arr[row][col]+ " ");
            }
            System.out.println();
        }
    }
}

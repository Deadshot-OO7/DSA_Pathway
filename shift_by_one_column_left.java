package Two_D_Arrays;

public class shift_by_one_column_left {
    public static void main(String[] args) {

        int [][]arr = {{1,2,3,4},{4,5,6,8},{7,8,9,10},{11,12,13,14}};

        for(int row=0; row<arr.length;row++) {
            for (int col=0;col<arr[0].length;col++) {
                System.out.print(arr[row][col]+ " ");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length-1; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][j+1];
                arr[i][j+1] = temp;
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

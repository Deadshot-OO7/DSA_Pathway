package Two_D_Arrays;

public class circular_shift_down_with_new_memory {
    public static void main(String[] args) {
        int [][]arr = {{1,2,3},{4,5,6},{7,8,9},{12,13,14}};
        int [][] temp = new int[arr.length][arr[0].length];

//        System.out.println("After Swapping");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(i==arr.length-1)
                    temp[0][j] = arr[i][j];
                else
                    temp[i+1][j] = arr[i][j];
            }
        }

                System.out.println("After Swapping");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(temp[i][j]+" ");
            }
            System.out.println();
        }
    }
}

package Two_D_Arrays;

public class mirror_image {
    public static void main(String[] args) {

        int [][]arr = {{1,2,3,4},{4,5,6,8},{7,8,9,10},{11,12,13,14}};

        for(int i=0; i<arr.length;i++) {
            for (int j=0;j<arr[0].length;j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < col/2; j++) {

                int temp = arr[i][j];
                arr[i][j] = arr[i][col-j-1];
                arr[i][col-j-1] = temp;
            }
        }
        System.out.println();
        for(int i=0; i<arr.length;i++) {
            for (int j=0;j<arr[0].length;j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}

package Two_D_Arrays;

public class max_of_each_col_and_its_index_in_a_new_array {
    public static void main(String[] args) {

        int [][]arr = {{2,3,1,4},{4,3,6,8},{7,8,9,1},{11,12,13,14}};
        int[][] newArr = new int[arr.length][2];

        for(int i=0; i<arr[0].length;i++) {
            int min = Integer.MIN_VALUE;
            for (int j=0;j<arr.length;j++) {
                if(arr[j][i] > min){
                    newArr[i][0] = arr[j][i];
                    newArr[i][1] = j;
                }
            }
        }

        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(newArr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

package Two_D_Arrays;

public class min_of_each_row_and_its_index_in_new_array {
    public static void main(String[] args) {
        int [][]arr = {{2,3,1,4},{4,3,6,8},{7,8,9,1},{11,12,13,14}};
        int[][] newArr = new int[arr.length][2];
        for(int i=0; i<arr[0].length;i++) {
            newArr[i][0] = Integer.MAX_VALUE;
            for (int j=0;j<arr.length;j++) {
                if(arr[i][j] < newArr[i][0]){
                    newArr[i][0] = arr[i][j];
                    newArr[i][1] = j;
                }
            }
//            System.out.println("Min ele of Col "+(i+1)+" is - "+min);
        }

        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(newArr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

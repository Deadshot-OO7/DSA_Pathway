package Two_D_Arrays;

public class min_of_each_row {
    public static void main(String[] args) {
        int [][]arr = {{1,2,3,4},{4,5,6,8},{7,8,9,10},{11,12,13,14}};
        for(int i=0; i<arr[0].length;i++) {
            int min = Integer.MAX_VALUE;
            for (int j=0;j<arr.length;j++) {
                if(arr[i][j]<min)
                    min = arr[i][j];
            }
            System.out.println("Min ele of Col "+(i+1)+" is - "+min);
        }
    }
}

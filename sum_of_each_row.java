package Two_D_Arrays;

public class sum_of_each_row {
    public static void main(String[] args) {
        int [][]arr = {{1,2,3,4},{4,5,6,8},{7,8,9,10},{11,12,13,14}};
        for(int i=0; i<arr.length;i++) {
            int sum = 0;
            for (int j=0;j<arr[0].length;j++) {
                sum+=arr[i][j];
            }
            System.out.println("Row "+(i+1)+" is - "+sum);
        }
    }
}

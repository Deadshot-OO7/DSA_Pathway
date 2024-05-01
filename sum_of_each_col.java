package Two_D_Arrays;

public class sum_of_each_col {
    public static void main(String[] args) {
        int [][]arr = {{1,2,3,4},{4,5,6,8},{7,8,9,10},{11,12,13,14}};
        for(int i=0; i<arr[0].length;i++) {
            int sum = 0;
            for (int j=0;j<arr.length;j++) {
                sum+=arr[j][i];
            }
            System.out.println("Col "+(i+1)+" is - "+sum);
        }
    }
}

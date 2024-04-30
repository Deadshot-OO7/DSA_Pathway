package Two_D_Arrays;

public class sum_of_diagonal_elements {
    public static void main(String[] args) {

        int [][]arr = {{3,4,1,2,11,5},{8,6,9,1,12,4},{5,6,2,4,8,3},{2,7,1,5,9,3}};
        int sum = 0;
        for(int i=0; i<arr.length;i++) {
            for (int j=0;j<arr[0].length;j++) {

                if(i==j || i+j+1==arr.length){
                    sum+=arr[i][j];
                }
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println(sum);
    }
}

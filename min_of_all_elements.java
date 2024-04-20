package Two_D_Arrays;

public class min_of_all_elements {
    public static void main(String[] args) {
        int [][]arr = {{1,2,3,4},{4,5,6,8},{7,8,9,10},{0,12,13,14}};

        int min = Integer.MAX_VALUE;

        for(int i=0; i<arr[0].length;i++) {
            for (int j=0;j<arr.length;j++) {
                if(arr[i][j] < min)
                    min = arr[i][j];
            }
        }
        System.out.println("Minimum ele is " + min);


    }
}

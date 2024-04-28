package Two_D_Arrays;

public class sort_each_column {
    public static void main(String[] args) {

        int [][]arr = {{3,4,1,2,11,5},{8,6,9,1,12,4},{5,6,2,4,8,3},{2,7,1,5,9,3}};

        for(int i=0; i<arr.length;i++) {
            for (int j=0;j<arr[0].length;j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

        for (int i = 0; i < arr[0].length; i++) { // for cols
            for (int j = 0; j < arr.length; j++) { // picked a col
                for (int k = j+1; k < arr.length; k++) {

                    if(arr[j][i] > arr[k][i]){
                        int temp = arr[j][i];
                        arr[j][i] = arr[k][i];
                        arr[k][i] = temp;
                    }
                }
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

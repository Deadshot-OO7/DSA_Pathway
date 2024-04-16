package Two_D_Arrays;

public class count_all_even_elements {
    public static void main(String[] args) {
        int [][]arr = {{2,3,1,4},{4,3,6,8},{7,8,9,1},{11,12,13,14}};
        int count = 0;
        for(int i=0; i<arr.length;i++) {
            for (int j=0;j<arr[0].length;j++) {
                if(arr[i][j]%2==0)
                    count++;
            }
        }

        System.out.println("Count of all even numbers is - " + count);
    }
}

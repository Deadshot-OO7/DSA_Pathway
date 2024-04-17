package Two_D_Arrays;
//Replace the “ADD CODE HERE” below with the code to find the sum of the values on the diagonal
// from [0][0] to [num rows - 1][num rows - 1] Print the sum. It should print 5.
public class diagonal_sum {
    public static void main(String[] args)
    {
        int[][] array = { {1,2,3},{-1,-2,-3},{4,5,6} };

        //ADD CODE HERE
        int sum = 0;
        for (int i = 0; i < array.length; i++) { // for rows
            for (int j = 0; j < array[0].length; j++) { //for cols
                if(i==j)
                    sum+=array[i][j];
            }

        }
        System.out.println(sum);

    }
}

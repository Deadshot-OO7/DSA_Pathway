package Two_D_Arrays;

//Print the values 8, 3, 87, and 34 by accessing them from the given two-dimensional array.

public class accessing_values {
    public static void main(String[] args)
    {
        int[][] arr = { {10,39,8},{3},{35,87},{22},{34} };

        // ADD CODE HERE //
        System.out.println(arr[0][2]);
        System.out.println(arr[1][0]);
        System.out.println(arr[2][1]);
        System.out.println(arr[4][0]);

    }
}

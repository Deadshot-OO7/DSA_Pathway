package Two_D_Arrays;
//Print the number of rows in the given two-dimensional array, or the length of the outer array. Then print the number of columns, or the length of each inner array.
//
//Ex. The array { {“hello”,”there”,”world”},{“how”,”are”,”you”} } should print:
//
//Rows: 2
//
//Columns: 3
public class printing_rows_cols {
    public static void main(String[] args)
    {
        String[][] arr = { {"hello","there","world"},
                {"how","are","you"} };

        System.out.println("Rows:");
        // ADD CODE TO PRINT NUMBER OF ROWS HERE //
        System.out.println(arr.length);

        System.out.println("Columns:");
        // ADD CODE TO PRINT NUMBER OF COLUMNS HERE //
        System.out.println(arr[0].length);
    }
}

package Two_D_Arrays;

public class _64_Word_Search {
    public static void main(String[] args) {

        char[][] A = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String word = "FCCED";

        int m = A.length;
        int n = A[0].length;

        wordSearch(A,word,m,n);

    }

    public static void wordSearch( char [][] A, String word, int m, int n){
        int row_start = 0;
        int col_start = 0;
        int row_end = n-1;
        int col_end = n-1;

        int itr = 0;

        while(itr++ < word.length()){





            System.out.println();
        }
    }
}

package Two_D_Arrays;

public class _69_Local_Maxima_or_Peak {
    public static void main(String[] args) {

        int[][] A = {
                {1, 2, 5, 3},
                {4, 5, 6, 6},
                {7, 8, 7, 9},
                {10, 11, 3, 12}
        };

        int[][] dir = {
                {-1,-1},
                {-1,0},
                {-1,1},
                {0,-1},
                {0,1},
                {1,-1},
                {1,0},
                {1,1},
        };

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                boolean isPeak = true;

                for (int k = 0; k < dir.length; k++) {
                    int row = i+dir[k][0];
                    int col = j + dir[k][1];

                    if(row>=0 && col>=0 && row<A.length && col<A[0].length){
                        if(A[i][j]>A[row][col]){
                            continue;
                        }else {
                            isPeak = false;
//                            break;
                        }
                    }
                }
                if(isPeak)
                    System.out.println(A[i][j] + " is the Peak of Index ("+i+","+j+")");
            }
        }

    }
}

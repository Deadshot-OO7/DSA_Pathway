package One_D_Arrays;

public class _290_Defuse_the_Bomb {
    public static void main(String[] args) {
        int[] code = {5,7,1,4};
        int k = 3;

        int len = code.length;
        int[] ans = new int[len];

        int[] arr = new int[len*3];
        int itr = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < len; j++) {
                arr[itr++] = code[j];
            }
        }

        int start = len;
        int end = 2*len - 1;
        int it = 0;

        for (int i = 0; i < len; i++) {

            if(k>0){
                for (int j = start+i; j < start+i+k; j++) {
                    ans[i] += arr[j];
                }
            } else if (k < 0) {
                for (int j = start-i-1; j > start-i-k; j--) {
                    ans[i] += arr[j];
                }
            }else {
                    ans[i] = 0;
            }
        }

        for (int n : ans)
            System.out.println(n);


    }
}

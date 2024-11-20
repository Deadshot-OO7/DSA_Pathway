package One_D_Arrays;

public class _292_Construct_the_Rectangle {
    public static void main(String[] args) {
        int area = 4;
        int[] ans = new int[2];
        int l = 1, w = 1;
        int diff = Integer.MAX_VALUE;
        int sqr = (int) Math.sqrt(area);

        for(int i = 1; i <= sqr ; i++){
            if(area % i == 0){
                int a = i;
                int b = area/a;

                if(Math.abs(a-b) < diff){
                    diff = Math.abs(a-b);
                    ans[0] = Math.max(a,b);
                    ans[1] = Math.min(a,b);
                }
            }
        }

        System.out.println(ans);
    }
}

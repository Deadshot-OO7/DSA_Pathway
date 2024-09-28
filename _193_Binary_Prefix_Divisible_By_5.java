package Bitwise_Operators;
import java.util.ArrayList;

public class _193_Binary_Prefix_Divisible_By_5 {
    public static void main(String[] args) {
        int [] nums = {1,0,0,1,0,1,0,0,1,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,0,1,0,0,0,0,1,1,0,1,0,0,0,1};

        ArrayList<Boolean> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder("");
        int sum = 0;
        for (int i = 0; i <nums.length ; i++) {
            sum=((sum<<1 )| nums[i])%5;
            if(sum==0){
                list.add(true);
            }
            else
                list.add(false);
        }

        System.out.println(list);
    }


}

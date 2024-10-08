package One_D_Arrays;

import java.util.HashMap;

public class _218_Sum_of_Digit_Differences_of_All_Pairs {
    public static void main(String[] args) {
        int[] nums =  {13,23,12};
        String[] arr = new String[nums.length];
        int itr = 0;
        for(int n : nums){
            arr[itr++] = Integer.toString(n);
        }
        int sum = 0;
        int len = nums.length;

        for (int k = 0; k < arr[0].length(); k++) {
            HashMap<Character,Integer> hm = new HashMap<>();
            for (int i = 0; i < len; i++) {
                if(hm.containsKey(arr[i].charAt(k)))
                    hm.put(arr[i].charAt(k),hm.get(arr[i].charAt(k))+1);
                else
                    hm.put(arr[i].charAt(k),1);
            }
            System.out.println(hm);
            int index = 0;
            for( int n : hm.values()){
                sum+=(hm.values().size()*(hm.values().size()-1))/2;
                System.out.println(sum);
                index++;
            }
        }
//        sum/=2;


        System.out.println(sum);

    }
    public static int diff(int a , int b){
        int sum = 0;
        while (a>0 && b>0){
            if(Math.abs((a%10) - (b%10))!=0)
                sum++;
            a/=10;
            b/=10;
        }
        return sum;
    }
}

package Bitwise_Operators;

public class _158_Power_of_Two {
    public static boolean main(String[] args){
        StringBuilder sb = new StringBuilder("");
        int n = 16;
        while(n>=1){
            sb.append(n%2);
            n/=2;
        }

        int count = 0;
        for(int i = 0 ; i<sb.length(); i++){
            if(sb.charAt(i)=='1')
                ++count;
        }
        if(count == 1)
            return true;

        return false;
    }
}

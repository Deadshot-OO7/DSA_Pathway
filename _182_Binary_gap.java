package Bitwise_Operators;

public class _182_Binary_gap {
    public static void main(String[] args) {

        int n = 8;

        String bin = Integer.toBinaryString(n);
        System.out.println(bin);

        int maxDistance = 0,inc = 0;

        for (int i = 0; i < bin.length() - 1; i++) {

            if(bin.charAt(i)=='1'){
                inc = 0;
                for (int j = i+1; j < bin.length(); j++) {
                    ++inc;
                    if(bin.charAt(j)=='1'){
                        if(maxDistance<inc)
                            maxDistance = inc;

                        break;
                    }
                }
            }
        }
        System.out.println(maxDistance);
    }
}

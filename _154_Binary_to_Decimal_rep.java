package Bitwise_Operators;

public class _154_Binary_to_Decimal_rep {
    public static void main(String []args){

        String binary = "11111";
        int decimal = 0;
        int pow = 0;
        for( int i = binary.length()-1; i >=0 ; i-- ){
            if(binary.charAt(i)=='1'){
                decimal+=(int)Math.pow(2,pow);
            }
            ++pow;
        }
        System.out.println(decimal);

    }
}

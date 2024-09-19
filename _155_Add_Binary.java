package Bitwise_Operators;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
public class _155_Add_Binary {
    public static void main(String[] args) {

        String a = "0", b = "0";
        int carry = 0;

        StringBuilder sb = new StringBuilder("");

        int i = a.length()-1;
        int j = b.length()-1;

        while((i>=0 || j>=0) || carry>0){
            int sum = 0;
            sum+=carry;
            if(i>=0 && a.charAt(i)=='1'){
                sum+=1;
            }
            if(j>=0 && b.charAt(j)=='1'){
                sum+=1;
            }
            if(sum==2){
                carry = 1;
                sb.append('0');
            }else if(sum==3){
                carry = 1;
                sb.append('1');
            }
            else{
                carry = 0;
                sb.append(sum);
            }
            i--;
            j--;
        }
        System.out.println(sb.reverse());


    }
}

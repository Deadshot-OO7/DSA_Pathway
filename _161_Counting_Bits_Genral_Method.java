package Bitwise_Operators;
import java.util.*;
public class _161_Counting_Bits_Genral_Method {
    public static void main(String[] args){
        int n = 5;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        for (int i = 2; i <= n; i++) {
            int count = 0;
            int num = i;
            while (num >= 1) {
                if (num % 2 == 1)
                    ++count;
                num /= 2;
            }
            list.add(count);
        }
        System.out.println(list);

        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            arr[i] = list.get(i);

    }
}

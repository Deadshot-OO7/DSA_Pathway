package Bitwise_Operators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
* An n-bit gray code sequence is a sequence of 2n integers where:

Every integer is in the inclusive range [0, 2n - 1],
The first integer is 0,
An integer appears no more than once in the sequence,
The binary representation of every pair of adjacent integers differs by exactly one bit, and
The binary representation of the first and last integers differs by exactly one bit.
Given an integer n, return any valid n-bit gray code sequence.
* */
public class _208_Gray_Code {
    public static void main(String[] args) {
        int s = 2;
        HashMap<Integer,Integer> hm = new HashMap<>();
              //Number, BitCount
        ArrayList<Integer> list = new ArrayList<>();
        int lastElement = (1<<s) - 1;

        for (int i = 1; i <= lastElement; i++) {
            hm.put(i,Integer.bitCount(i));
        }
        //0,1,3,2,5,4,6,7
        System.out.println(hm);

        int itr = 0;
        list.add(0);

        while (list.size() != lastElement) {
            Iterator<Map.Entry<Integer, Integer>> iterator = hm.entrySet().iterator();

            while (iterator.hasNext() && hm.size()==1) {
                Map.Entry<Integer, Integer> entry = iterator.next();

                System.out.println("Checking key: " + entry.getKey());

                // Check your condition
                if ((Integer.bitCount(list.getLast()) - entry.getValue() == 1 || Integer.bitCount(list.getLast()) - entry.getValue() == -1)) {
                    {
                        int count = 0;
                        StringBuilder n = new StringBuilder(Integer.toBinaryString(list.getLast()));
                        StringBuilder m = new StringBuilder(Integer.toBinaryString(entry.getKey()));
                        System.out.println(n);
                        System.out.println(m);
                        int len = Math.max(n.length(),m.length());

                        if(len!=n.length()){
                            n.reverse();
                            while(n.length()!=len)
                                n.append(0);
                            n.reverse();
                        }else{
                            m.reverse();
                            while (m.length()!=len)
                                m.append(0);
                            m.reverse();
                        }

                        for (int i = len-1; i >=0; i--) {
                            if(n.charAt(i)!=m.charAt(i))
                                count++;
                        }

                        if(count==1){
                            list.add(entry.getKey()); // Add to the list

                            iterator.remove(); // Safely remove the current entry from the map
                            System.out.println("Key removed: " + entry.getKey());

                        }
                    }
                }
                System.out.println(hm);
                for(int key : hm.keySet())
                    list.add(key);

            }

        }        System.out.println(hm);
        for(int key : hm.keySet())
            list.add(key);


        System.out.println(list);


    }

    public  static int isDiffOne(int a, int b){
        int count = 0;
        StringBuilder n = new StringBuilder(Integer.toBinaryString(a));
        StringBuilder m = new StringBuilder(Integer.toBinaryString(b));
        System.out.println(n);
        System.out.println(m);
        int len = Math.max(n.length(),m.length());

        if(len!=n.length()){
            n.reverse();
            while(n.length()!=len)
                n.append(0);
            n.reverse();
        }else{
            m.reverse();
            while (m.length()!=len)
                m.append(0);
            m.reverse();
        }

        for (int i = len-1; i >=0; i--) {
            if(n.charAt(i)!=m.charAt(i))
                count++;
        }

        return count;
    }
}

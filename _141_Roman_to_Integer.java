package StringBuilder;

import java.util.Hashtable;
/*
* Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
*
*
*
* I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.

* */
public class _141_Roman_to_Integer {
    public static void main(String[] args) {
        Hashtable<Character,Integer> ht = new Hashtable<Character, Integer>();
        int sum = 0;
        String s = "MCMXCIV";

        ht = hastTableInitialize(ht);
        System.out.println(ht);

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='I' && i!=s.length()-1){
                if(s.charAt(i+1)=='V'){
                    sum+=4;
                    i++;
                } else if (s.charAt(i+1)=='X') {
                    sum+=9;
                    i++;
                }else{
                    sum+=ht.get(s.charAt(i));
                }
            } else if(s.charAt(i)=='X' && i!=s.length()-1) {
                if (s.charAt(i + 1) == 'L') {
                    sum += 40;
                    i++;
                } else if (s.charAt(i + 1) == 'C') {
                    sum += 90;
                    i++;
                }else{
                    sum+=ht.get(s.charAt(i));
                }
            } else  if(s.charAt(i)=='C' && i!=s.length()-1) {
                if (s.charAt(i + 1) == 'D') {
                    sum += 400;
                    i++;
                } else if (s.charAt(i + 1) == 'M') {
                    sum += 900;
                    i++;
                }else{
                    sum+=ht.get(s.charAt(i));
                }
            } else {
                System.out.println("Char-->"+s.charAt(i) + " Value -->"+ht.get(s.charAt(i)));
                sum+=ht.get(s.charAt(i));
            }

        }
        System.out.println(sum);


    }

    public static Hashtable hastTableInitialize(Hashtable ht){
        ht.put('I',1);
        ht.put('V',5);
        ht.put('X',10);
        ht.put('L',50);
        ht.put('C',100);
        ht.put('D',500);
        ht.put('M',1000);
        return ht;
    }
}

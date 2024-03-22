package Oops;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        String [] a = new String[3];
        ArrayList<String> sal = new ArrayList <String> ();

        System.out.println(sal);
        sal.add("first");
        sal.add("second");
        sal.add("third");
        System.out.println(sal);
        System.out.println(sal.contains("sec"));
        System.out.println(sal.indexOf("first"));
        sal.removeFirst();
        System.out.println(sal);
        sal.removeLast();
        System.out.println(sal);
    }
}

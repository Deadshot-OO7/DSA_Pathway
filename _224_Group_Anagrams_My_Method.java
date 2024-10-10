package Sorting;

import java.util.ArrayList;
import java.util.List;

public class _224_Group_Anagrams_My_Method {
    public static void main(String[] args) {
        List<List<String>> res = new ArrayList<>();
        ArrayList<String> ip = new ArrayList<>();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        for(String s : strs)
            ip.add(s);

        for (int i = 0; i < ip.size(); i++) {   //picked first string
            ArrayList<String> list = new ArrayList<>();
            for (int j = i; j < ip.size(); j++) {   // picked second str
                if(ip.get(i).length() == ip.get(j).length() && i!=j){

                    StringBuilder sb1 = new StringBuilder(ip.get(i));
                    StringBuilder sb2 = new StringBuilder(ip.get(j));
                    int k = 0;  //index to iterate over each chars of str2
                    while( !sb1.isEmpty() && !sb2.isEmpty()){
                        int index = sb1.indexOf(""+sb2.charAt(k));
                        if(index>=0){
                            sb1 = new StringBuilder( sb1.substring(0,index)+sb1.substring(index+1));
                            sb2 = new StringBuilder( sb2.substring(k+1));
                            System.out.println(sb1+" "+sb2);
                        }
                        else
                            break;

//                        k++;
                    }

                    if(sb1.isEmpty() && sb2.isEmpty()){ //every char of both are present in each other
                        list.add(ip.get(j));
                        ip.remove(j);
                        j--;
                    }

                }
            }
            list.add(ip.get(i));
//            System.out.println(ip);
            res.add(list);
        }
        System.out.println(ip);
        System.out.println(res);
    }
}

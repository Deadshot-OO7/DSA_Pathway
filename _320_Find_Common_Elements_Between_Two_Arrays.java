package One_D_Arrays;

import java.util.ArrayList;

public class _320_Find_Common_Elements_Between_Two_Arrays {
    public static void main(String[] args) {
        int[] nums1 = {4,3,2,3,1};
        int[] nums2 = {2,2,5,2,3,6};

        int[] ans = new int[2];

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        int n1=0,n2 = 0;

        for (int n : nums1)
            list1.add(n);

        for(int n : nums2)
            list2.add(n);

        for (int i = 0; i < nums1.length; i++) {
            if(list2.contains(nums1[i]))
                n1++;
        }

        for (int i = 0; i < nums2.length; i++) {
            if(list1.contains(nums2[i]))
                n2++;
        }

        ans[0] = n1;
        ans[1] = n2;

    }
}

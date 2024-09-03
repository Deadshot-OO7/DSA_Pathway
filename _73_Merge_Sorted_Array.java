package Two_D_Arrays;

public class _73_Merge_Sorted_Array {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3,n = 3;
        int[] nums2 = {2,5,6};

        int[] A = new int[nums1.length];
        int itrA = 0, itrB = 0;

        for(int i = 0 ; i < A.length && itrA< nums1.length && itrB< nums2.length; i++){

            if(nums1[itrA] == 0) {
                A[i] = nums2[itrB];
                itrB++;
            } else if (nums2[itrB] == 0) {
                A[i] = nums1[itrA];
                itrA++;
            }
            else {
                if (nums1[itrA] < nums2[itrB]) {
                    A[i] = nums1[itrA];
                    itrA++;
                } else if (nums1[itrA] == nums2[itrB]) {
                    A[i] = nums1[itrA];
                    itrA++;
                } else if (nums1[itrA] > nums2[itrB]) {
                    A[i] = nums2[itrB];
                    itrB++;
                }
            }


        }

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+" ");
        }
    }
}

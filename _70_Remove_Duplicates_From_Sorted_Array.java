package Two_D_Arrays;

public class _70_Remove_Duplicates_From_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int len = nums.length;
        int[] A = new int[len];

        A[0]=nums[0];

        int itr = 1;

        for(int i = 1; i< len;i++){
            if(A[itr-1] != nums[i] ){
                A[itr++]=nums[i];
            }

        }

        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }

//        System.out.println(itr);

    }
}

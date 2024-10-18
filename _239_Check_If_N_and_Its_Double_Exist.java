package Sorting;

public class _239_Check_If_N_and_Its_Double_Exist {
    public static void main(String[] args) {
        int[] arr = {10,2,5,3};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length ; j++) {
                if(i!=j && arr[i]==2*arr[j])
                    System.out.println(true);            }
        }
        System.out.println(false);
    }
}

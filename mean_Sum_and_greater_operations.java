package One_D_Arrays;

public class mean_Sum_and_greater_operations {
    public static void main(String[] args) {

        int [] arr = {43,21,65,342,66,73,234,77};
        int sum = 0;
        for(int item : arr){
            //sum of all numbers
            sum=sum+item;

            //printing number greater than 100
            if(item>100)
                System.out.println(item);

        }
        System.out.println("Sym :" + sum);

        double mean = 0;

        mean = (double )sum/arr.length;

        System.out.println("Mean :"+mean);

    }
}

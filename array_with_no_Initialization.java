package One_D_Arrays;

public class array_with_no_Initialization {
    public static void main(String[] args) {

        int[] subject = new int[3];

        subject[0] = 23;
        subject[1] = 24;
        subject[2] = 25;

//        System.out.println(subject[0]);
//        System.out.println(subject[1]);
//        System.out.println(subject[2]);

        //You can use loop to go over each ele
        for (int i = 0; i < subject.length; i++) {
            System.out.println(subject[i]);

        }
    }
}

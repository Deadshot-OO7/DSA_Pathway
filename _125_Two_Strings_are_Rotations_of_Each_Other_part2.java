package StringBuilder;

public class _125_Two_Strings_are_Rotations_of_Each_Other_part2 {
    public static void main(String[] args) {
        String str1 = "rotation" ,str2 = "tationro", concatenated = "";
        if (str1.length() != str2.length() || str1.length() == 0) {
            System.out.println(false);
            return;
        }

        concatenated = str1+str1;

        if(concatenated.contains(str2))
            System.out.println(true);
        else
            System.out.println(false);
    }
}

package StringBuilder;

public class _124_Two_Strings_are_Rotations_of_Each_Other_Part1 {
    public static void main(String[] args) {
        String str1 = "abcd" ,str2 = "acbd", rotatedString = "";
        //len = 8, rot = 7
        StringBuilder sb = new StringBuilder("");
        boolean isRotation = false;
        if(str1.length()!=str2.length())
        {
            System.out.println(false);
            return;
        }

        if(str1.compareTo(str2)==0){
            System.out.println(true);
            return;
        }
        rotatedString = str1;
        for (int i = 0; i < str1.length() - 1; i++) {

            for (int j = 1 ; j < rotatedString.length(); j++) {
                sb.append(rotatedString.charAt(j));
            }
            sb.append(rotatedString.charAt(0));

            rotatedString = sb+"";
            if(str2.compareTo(""+sb)==0){
                System.out.println(true);
                isRotation = true;
                break;
            }else
                sb = new StringBuilder("");
        }
        if(!isRotation)
            System.out.println(false);
    }
}

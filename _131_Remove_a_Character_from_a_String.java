package StringBuilder;

public class _131_Remove_a_Character_from_a_String {
    public static void main(String[] args) {
        String main_string = "the cat sat on the mat";
        char ch = 'o';

        for (int i = 0; i < main_string.length(); i++) {
            if(main_string.charAt(i)==ch){
                main_string = main_string.substring(0,i)+main_string.substring(i+1);
                System.out.println(main_string);
            }
        }
    }
}

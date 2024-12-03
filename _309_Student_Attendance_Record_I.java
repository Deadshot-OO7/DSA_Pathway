package Strings;

public class _309_Student_Attendance_Record_I {
    public static boolean main(String[] args) {
        String s = "PPALLP";
        if(s.contains("LLL")){
            return false;
        }
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                count++;
            }
        }
        if(count>=2){
            return false;
        }
        return true;
    }
}

package Recursion;

public class _304_Tower_of_Hanoi {
    public static void main(String[] args) {
        int n = 3;

        towerOfHanoi(n,"Source","Helper","Destination");
    }

    public static void towerOfHanoi( int n, String src, String helper, String dest ){

        if( n == 1){
            System.out.println("Disk " + n +" transferred from " + src + " to " + dest);
            return;
        }

        towerOfHanoi(n-1,src,dest,helper);
        System.out.println("Disk " + n +" transferred from " + src + " to " + dest);
        towerOfHanoi(n-1, helper,src,dest);
    }
}

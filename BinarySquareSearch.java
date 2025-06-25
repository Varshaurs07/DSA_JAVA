package DSA_JAVA;

public class BinarySquareSearch {
    public static int binarysqu(int n){
        if(n==0 || n==1){
            return n;
        }
        int l=1;
        int h=n;
        int result = 0;
        while(l<=h){
            int mid =(l+h)/2;
            if(mid * mid == n){
                return mid;
            }
            if(mid <= n/mid){
                l = mid+1;
                result = mid;
            } else {
                h = mid -1;
            }
        }
        return result; // if return -1 is written instead of 2 for n2=6 it will print -1
    }
    public static void main(String[] args) {
        int n1 = 16;
        System.out.println("Output is: " + binarysqu(n1));
        int n2 = 14;
        System.out.println("Output is: " + binarysqu(n2));
    }
}

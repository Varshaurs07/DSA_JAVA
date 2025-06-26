package DSA_JAVA;

public class slidingwindow {
    public static void main(String[] args) {
        int a[] = {3, 8, 2, 5, 7, 6, 12};
        int n = a.length;
        int w = 4;
        int curr = 0;
        for(int i=0; i<w; i++){
            curr = curr + a[i];
        }
        int max = curr;
        for(int i=1; i<=n-w; i++){
            curr = curr - a[i-1] + a[i+w-1];
            if(curr>max){
                max = curr;
            }
        }
        System.out.println(max);
    }
}


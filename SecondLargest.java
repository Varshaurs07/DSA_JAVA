package DSA_JAVA;

public class SecondLargest {
    public static void main(String[] args) {
        int a[] = {12, 35, 1, 10, 34, 1};
        int n = a.length;
        int s1 = -1;
        int s2 = -1;
        for(int i=0; i<n; i++){
        if(a[i] > s1){
            s2 = s1;
            s1 = a[i];
        } else if(a[i]>s2 && a[i]<s1){
            s2 = a[i];
        }
    }
    System.out.println(s2);
    }
}


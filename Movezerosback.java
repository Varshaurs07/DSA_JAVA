package DSA_JAVA;

public class Movezerosback {
    public static void main(String[] args) {
        int a[] = {1,2,0,0,3};
        int count = 0;
        int n = a.length;
        for(int i=0;i<n;i++){
            if(a[i]!=0){
            a[count++] = a[i];
            }
        }
        while(count<n){
            a[count++] = 0;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]);
        }
    }
}



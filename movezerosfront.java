package DSA_JAVA;

public class movezerosfront {
    public static void main(String[] args) {
        int a[] = {1, 0, 1, 0, 1, 0};
        int count = 0;
        int n = a.length;
        int a2[] = new int[n];
        for(int i=0;i<n;i++){
            if(a[i]==0){
            a2[count++] = a[i];
            }
        }
        for(int i=0; i<n; i++){
            if(a[i] != 0){
                a2[count++]=a[i];
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a2[i] + " ");
        }
    }
}





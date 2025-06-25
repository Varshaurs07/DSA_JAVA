package DSA_JAVA;

public class ProductOfArrayElements {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        int n = a.length;
        int prd = 1;
        int a1[] = new int[a.length];
        for(int i=n-1; i>=0; i--){
            prd = 1;
            for(int j=i; j>=0; j--){
                prd*=a[j];
            }
            System.out.println(prd);
        }
    }
}

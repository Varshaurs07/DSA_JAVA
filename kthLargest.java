package DSA_JAVA;

public class kthLargest {
    public static void main(String[] args) {
        int a[] = {1, 2, 4, 3};
        int n = a.length;
        int temp = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if(a[j]<a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp; 
                }
            }
        }
        for(int i=0; i<n; i++){
        System.out.print(a[i] + " ");
        }

        System.out.println();
        int k = 2;
        for (int i=0; i<k; i++){
            System.out.println(a[i]);
            }
        }
    }
    

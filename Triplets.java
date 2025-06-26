package DSA_JAVA;

public class Triplets {
    public static void main(String[] args) {
        int arr[] = {1,5,3,2};
        int n = arr.length;
        int count =0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int sum =arr[i]+arr[j];
                for(int k=0; k<n; k++){
                    if(arr[k] == sum){
                        count++;
                        System.out.println("(" + arr[i] + "," + arr[j] + "," + arr[k] + ")");
            }
        }
            }
        }
        System.out.println("Total Triplets: " + count);
    }
}

